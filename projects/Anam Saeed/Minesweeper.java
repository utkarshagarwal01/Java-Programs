import java.applet.*;
import java.awt.*;
import java.util.*;

public class Minesweeper extends Applet implements Runnable 
{

  int edge = 16;			/* pixels on the edge of a square */
  int width = 16;			/* width in squares */
  int height = 16;			/* height in squares */
  int mines = 10;			/* number of mines */
  int scoreHeight = 48;			/* pixels at top used for scores */
  int faceSize = 32;			/* pixels size of smiley face */

  /* "adjacent" and "exposed" are indexed by square number = y*width+x */
  
  /* "adjacent" contains the board layout and derived state.  adjacent[i] is
     the count of mines adjacent to square i, or "mine" if square i contains
     a mine.  */
  int[] adjacent = null;		/* count of adjacent mines */
  static final int mine = 9;		/* adjacency count for mine */
  
  /* "exposed" contains the exposure state of the board.  Values > "unexposed"
     represent exposed squares; these either have the distinquished values
     "exploded" or "incorrect", or some greater value (left over from the
     pending exposure queue) for plain old exposed squares.  Values <=
     "unexposed" include plain old unexposed squares, or one of the markers.
     ----
     During the "expose" method, the queue of pending exposures is a linked
     list through this array, using array indexes.  The method holds the head
     and tail.  "listEnd" is the tail marker.
     ----
     "initOffscreen" assumes that the distinguished values in "exposed" are
     distinct integers from the adjacency counts, for simplicity in calling
     initOneOffscreen. */
  int[] exposed = null;			/* exposure state / pending exposures */
  static final int listEnd = -1;	/* end marker in "exposed" */
  static final int incorrect = -2;	/* incorrect flag, at end of game */
  static final int exploded = -3;	/* exploded mine (at end of game!) */
  static final int unexposed = -4; 	/* default state at start of game */
  static final int flagged = -5;	/* marker flag by user */
  static final int queried = -6;	/* query flag by user */

  int flags = 0;			/* count of flags currently set */
  int remaining = 0;			/* count of unexposed squares */
  int sadness = 0;			/* whether smiley is sad */
  static final int sad = -1;		/* smiley value after loss */
  static final int bored = 0;		/* smiley value during game */
  static final int happy = 1;		/* smiley value after win */
  
  /* Various state used in painting.  There are offscreen images for each state
     of the squares */
  Color[] colors = null;		/* color for exposed counts */
  Color baseColor;			/* color for unexposed squares */
  Color baseShadow;			/* slightly darker than baseColor */
  Color mineColor;			/* color for mine itself */
  Color numberColor;			/* color for score digits */
  Color dangerousColor;			/* color for flag, explode, incorrect */
  Image[] exposedRect = null;
  Image incorrectRect = null;
  Image explodedRect = null;
  Image unexposedRect = null;
  Image flaggedRect = null;
  Image queriedRect = null;
  Image boredSmiley = null;
  Image happySmiley = null;
  Image sadSmiley = null;
  Font theMainFont;
  Font theScoreFont;
  int numberSize;			/* Pixels for number display */
  final static int numberMargin = 2;

  
  long startTime = 0;			/* time of first click; 0 if stopped */
  int elapsed = 0;			/* elapsed time; -1 if not started */
  
  
  /* */
  /* Game play */
  /* */
  
  private void add1(int x, int y) {
    /* Increase adjacency count, if it's in range */
    if (x<0 || x>=width || y<0 || y>=height) return;
    int t = y*width+x;
    if (adjacent[t] != mine) adjacent[t]++;
  }
  
  private synchronized void erase() {
    /* Start of new game. Includes implicit initialization. */
    if (adjacent == null) adjacent = new int[width*height];
    if (exposed == null) exposed = new int[width*height];
    for (int i = 0; i < width*height; i++) {
      adjacent[i] = 0;
      exposed[i] = unexposed;
    };
    int laid = 0;
    while (laid < mines) {
        int target = (short)Math.floor(Math.random()*height*width);
        if (target>=0 && target < height*width && adjacent[target] != mine) {
          adjacent[target] = mine;
          int tx = target%width;
          int ty = target/width;
          add1(tx-1, ty-1);
          add1(tx-1, ty);
          add1(tx-1, ty+1);
          add1(tx, ty-1);
          add1(tx, ty+1);
          add1(tx+1, ty-1);
          add1(tx+1, ty);
          add1(tx+1, ty+1);
          laid++;
        };
    }
    flags = 0;
    remaining = width*height;
    startTime = 0;
    elapsed = -1;
    sadness = bored;
    repaint();
  }
  
  int tail = listEnd;				/* tail of pending exposures */
  
  private void expose1(Graphics g, int x, int y) {
    /* expose single square at (x,y) and add to list. */
    if (x<0 || x>=width || y<0 || y>=height) return;
    int e = y*width+x;
    if (exposed[e] <= unexposed && exposed[e] != flagged) {
      remaining--;
      exposed[e] = listEnd;
      exposed[tail] = e;
      tail = e;
      paintSquare(g, x, y);
    }
  }
  
  private void expose(int x, int y) {
    /* Expose given square, if not already exposed.  If square has 0 adjacency,
       expose surrounding squares, iteratively. */
    int thisSquare = y*width+x;
    if (thisSquare<0 || thisSquare >= width*height) return;
    if (exposed[thisSquare] > unexposed) return;
    Graphics g = getGraphics();
    if (adjacent[thisSquare] == mine) {
      /* End of game: explode it and expose other mines */
      remaining--;
      exposed[thisSquare] = exploded;
      paintSquare(g, x, y);
      for (int y2 = 0; y2<height; y2++) {
        for (int x2 = 0; x2<width; x2++) {
          int i = y2*width+x2;
          if (i==thisSquare) {
          } else if (adjacent[i] == mine && exposed[i] != flagged) {
            remaining--;
            exposed[i] = listEnd;
            paintSquare(g, x2, y2);
          } else if (adjacent[i] != mine && exposed[i] == flagged) {
            remaining--;
            exposed[i] = incorrect;
            paintSquare(g, x2, y2);
          }
        }
      }
      startTime = 0; /* turn off timer */
      sadness = sad;
      paintFace(g);
    } else {
      /* Initialize pending exposure list to this square */
      remaining--;
      exposed[thisSquare] = listEnd;
      tail = thisSquare;
      paintSquare(g, x, y);
      int pending = thisSquare;
      /* Until pending reaches the end of the exposure list, expose neighbors */
      while (pending != listEnd) {
        if (adjacent[pending]==0) {
          int px = pending%width;
          int py = pending/width;
          expose1(g, px-1, py-1);
          expose1(g, px-1, py);
          expose1(g, px-1, py+1);
          expose1(g, px, py-1);
          expose1(g, px, py+1);
          expose1(g, px+1, py-1);
          expose1(g, px+1, py);
          expose1(g, px+1, py+1);
        }
        pending = exposed[pending];
      }
      if (remaining==mines) {
        /* End of game: flag all remaining unflagged mines */
        for (int y2 = 0; y2<height; y2++) {
          for (int x2 = 0; x2<width; x2++) {
            int i = y2*width+x2;
            if (adjacent[i] == mine && exposed[i] <= unexposed &&
                                       exposed[i] != flagged ) {
              exposed[i] = flagged;
              flags++;
              paintSquare(g, x2, y2);
            }
          }
        }
        paintFlags(g);
        startTime=0;
        sadness=happy;
        paintFace(getGraphics());
      }
    }
  }
  


  /* */
  /* Applet public methods, including the daemon thread */
  /* */
  
  public void init() {
    try {
      String wStr = getParameter("COLUMNS");
      String hStr = getParameter("ROWS");
      String pStr = getParameter("PIXELS");
      String mStr = getParameter("MINES");
      if (wStr != null) width = Integer.parseInt(wStr);
      if (hStr != null) height = Integer.parseInt(hStr);
      if (pStr != null) edge = Integer.parseInt(pStr);
      if (mStr != null) mines = Integer.parseInt(mStr);
    } catch (NumberFormatException e) {
    }
    scoreHeight = edge*3;
    faceSize = edge*2;
    erase();
  }
  
  Thread daemon = null;
  
  public synchronized void start() {
    daemon = new Thread(this);
    daemon.start();
  }

  public synchronized void stop() {
    daemon = null;
  }

  public void destroy() {
  }

  public void run() {
    while (true) {
      synchronized(this) {
        if (daemon != Thread.currentThread()) return;
        if (startTime != 0) {
          long now = System.currentTimeMillis();
          int oldElapsed = elapsed;
          elapsed = Math.round((0.0f+(now-startTime))/1000);
          if (elapsed != oldElapsed) paintTime(getGraphics());
        }
      }
      try { Thread.sleep(100); } catch (InterruptedException e) { };
    }
  }


  /* */
  /* Painting */
  /* */
  
  private Image initOneOffscreen(int i) {
    /* Create offscreen image for a square.  "i" is either an adjacency count,
       or a distinguished value of "exposed". */
    Image off = createImage(edge, edge);
    Graphics g = off.getGraphics();
    g.setColor(i==exploded ? dangerousColor : baseColor);
    if (i > unexposed) {
      g.fillRect(0, 0, edge, edge);
      g.setColor(baseShadow);
    } else {
      g.fill3DRect(0, 0, edge-1, edge-1, true);
      g.setColor(Color.black);
    };
    g.drawLine(edge-1, 0, edge-1, edge-1);
    g.drawLine(0, edge-1, edge-1, edge-1);
    int halfWidth = edge/2;
    int quarterPos = (edge-1)/4;
    if (i==unexposed || i==0 ) {
    } else if (i==mine || i==exploded) {
      /* A circle with four lines through it, and a highlight */
      g.setColor(mineColor);
      g.drawLine(2, 2, edge-4, edge-4);
      g.drawLine(edge-4, 2, 2, edge-4);
      g.drawLine(halfWidth-1, 1, halfWidth-1, edge-3);
      g.drawLine(1, halfWidth-1, edge-3, halfWidth-1);
      g.fillOval(quarterPos, quarterPos, halfWidth+1, halfWidth+1);
      g.setColor(Color.white);
      g.fillOval(halfWidth-3, halfWidth-3, edge/8, edge/8);
    } else if (i==incorrect) {
      /* A diagonal cross, 3 pixels wide */
      g.setColor(dangerousColor);
      g.drawLine(2, 2, edge-4, edge-4);
      g.drawLine(2, 3, edge-5, edge-4);
      g.drawLine(3, 2, edge-4, edge-5);
      g.drawLine(edge-4, 2, 2, edge-4);
      g.drawLine(edge-4, 3, 3, edge-4);
      g.drawLine(edge-5, 2, 2, edge-5);
    } else if (i==flagged) {
      /* A flag on a pole with a base */
      g.setColor(dangerousColor);
      g.fillRect(halfWidth-4, halfWidth-5, halfWidth-4, halfWidth-4);
      g.setColor(mineColor);
      g.drawLine(halfWidth, 3, halfWidth, edge-4);
      g.drawLine(5, edge-4, edge-5, edge-4);
    } else {
      /* A question mark or the adjacency count */
      FontMetrics fm = this.getFontMetrics(theMainFont);
      int fontAscent = fm.getAscent();
      String s = i==queried ? "?" : ""+i;
      g.setColor(i==queried ? new Color(0,0,255) : colors[i]);
      g.setFont(theMainFont);
      g.drawString(s, (edge-fm.stringWidth(s))/2, fontAscent);
    };
    return off;
  }
  
  private Image initOneSmiley(int theSadness) {
    Image off = createImage(faceSize, faceSize);
    Graphics g = off.getGraphics();
    g.setColor(Color.black);
    g.fillRect(0, 0, faceSize, faceSize);
    g.setColor(baseColor);
    g.fill3DRect(1, 1, faceSize-2, faceSize-2, true);
    g.fill3DRect(2, 2, faceSize-4, faceSize-4, true);
    g.setColor(Color.yellow);
    g.fillOval(6, 6, faceSize-12, faceSize-12);
    g.setColor(Color.black);
    g.drawOval(6, 6, faceSize-12, faceSize-12);
    if (theSadness==sad) {
      g.drawArc(10, faceSize-13, faceSize-20, faceSize-20, 135, -100);
    } else if (theSadness==happy) {
      g.drawArc(10, 10, faceSize-20, faceSize-20, -35, -100);
    } else {
      g.fillRect(12, faceSize-12, faceSize-23, 1);
    }
    g.fillOval(13, 13, 2, 2);
    g.fillOval(faceSize-12-2, 13, 2, 2);
    return off;
  }
  
  private void initOffscreen() {
    baseColor = new Color(204,204,204);
    baseShadow = new Color(153,153,153);
    mineColor = new Color(51,51,51);
    numberColor = new Color(255,102,102);
    dangerousColor = new Color(255,51,51);
    colors = new Color[10];
    colors[0] = Color.black;
    colors[1] = new Color(51,51,204);		/* blue */
    colors[2] = new Color(0,102,0);		/* green */
    colors[3] = new Color(204,0,0);		/* red */
    colors[4] = new Color(102,0,102);		/* purple */
    colors[5] = new Color(0,102,102);		/* dark cyan */
    colors[6] = Color.black;
    colors[7] = Color.black;
    colors[8] = Color.black;
    colors[mine] = Color.black;
    theMainFont = new Font("TimesRoman", Font.BOLD, (edge*5)/8+2);
    theScoreFont = new Font("TimesRoman", Font.BOLD, (edge*5)/4);
    numberSize = this.getFontMetrics(theScoreFont).stringWidth("000") +
                 numberMargin*2;
    explodedRect = initOneOffscreen(exploded);
    incorrectRect = initOneOffscreen(incorrect);
    unexposedRect = initOneOffscreen(unexposed);
    flaggedRect = initOneOffscreen(flagged);
    queriedRect = initOneOffscreen(queried);
    exposedRect = new Image[mine+1];
    for (int i = 0; i<=mine; i++) exposedRect[i] = initOneOffscreen(i);
    happySmiley = initOneSmiley(happy);
    boredSmiley = initOneSmiley(bored);
    sadSmiley = initOneSmiley(sad);
  }
  
  private void paintNumber(Graphics g, int n, int right) {
    String s = (n>999 || n<-99 ? "---" : ""+n);
    if (unexposedRect==null) return;
    FontMetrics fm = this.getFontMetrics(theScoreFont);
    int fontAscent = fm.getAscent();
    int fontHeight = fm.getHeight();
    int top = (scoreHeight-fontHeight)/2;
    g.setColor(Color.black);
    g.fillRect(right-numberSize, top-numberMargin, numberSize, fontHeight+numberMargin*2);
    g.setColor(numberColor);
    g.setFont(theScoreFont);
    g.drawString(s, right-fm.stringWidth(s)-numberMargin, top+fontAscent);
  }
  
  private void paintFlags(Graphics g) {
    paintNumber(g, mines-flags, numberSize+(width*edge-faceSize-numberSize*2)/4);
  }
  
  private void paintTime(Graphics g) {
    paintNumber(g, elapsed<0?0:elapsed,
                width*edge-(width*edge-faceSize-numberSize*2)/4);
  }
  
  private void paintSquare(Graphics g, int x, int y) {
    /* Paint given square. */
    if (unexposedRect==null) return;
    int n = y*width+x;
    int exposure = exposed[n];
    Image im = exposure==exploded ? explodedRect :
               exposure==incorrect ? incorrectRect :
               exposure==unexposed ? unexposedRect :
               exposure==flagged ? flaggedRect :
               exposure==queried ? queriedRect :
               exposedRect[adjacent[n]];
    g.drawImage(im, x*edge, y*edge+scoreHeight, this);
  }
  
  private void paintFace(Graphics g) {
    g.drawImage(sadness==sad?sadSmiley:sadness==happy?happySmiley:boredSmiley,
                (width*edge-faceSize)/2, (scoreHeight-faceSize)/2, this);
  }

  public synchronized void paint(Graphics g) {
    if (unexposedRect==null) initOffscreen();
    g.setColor(baseColor);
    g.fill3DRect(0, 0, width*edge, scoreHeight, true);
    paintFlags(g);
    paintFace(g);
    paintTime(g);
    for (int y = 0; y<height; y++) {
      for (int x = 0; x<width; x++) {
        paintSquare(g, x, y);
      }
    }
  }

  public void update(Graphics g) {
    paint(g);
  }
  
  
  /* */
  /* User input */
  /* */
  
  public synchronized boolean mouseDown(Event evt, int xCoord, int yCoord) {
    if (yCoord<scoreHeight) {
      int smileyX = (width*edge-faceSize)/2;
      int smileyY = (scoreHeight-faceSize)/2;
      if (xCoord >= smileyX && xCoord < smileyX+faceSize &&
          yCoord >= smileyY && yCoord < smileyY+faceSize) {
        erase(); /* start new game */
      }
    } else if (sadness != bored) {
      /* Game over */
    } else if (xCoord>=0 && xCoord<width*edge) {
      if (elapsed<0) {
        startTime = System.currentTimeMillis();
        elapsed = 0;
      };
      int x = xCoord/edge;
      int y = (yCoord-scoreHeight)/edge;
      int n = y*width+x;
      if (evt.shiftDown() || evt.metaDown() ) {
        if (exposed[n] == unexposed) {
          exposed[n] = flagged; flags++; paintFlags(getGraphics());
        } else if (exposed[n] == flagged) {
          exposed[n] = queried; flags--; paintFlags(getGraphics());
        } else if (exposed[n] == queried) {
          exposed[n] = unexposed;
        }
        paintSquare(getGraphics(), x, y);
      } else if (exposed[n] != flagged) {
        expose(x, y);
      };
    };
    return true;
  }
}
