//Imports the Abstract Window Toolkit(AWT) Package
import java.awt.*;
//Imports the Applet Package which contains the applet class
import java.applet.*;
public class SchoolProject1  extends Applet 
{
  //text1 is a text field displayed on the applet viewer which is used to input data
 TextField text1;   
 /*s:-It is a string which retrieves the data inputted in the text field(text1) and stores in it
  *msg:-It is a string used to display a message asking the user to input
  *ww:-It is a string used to display "ERROR" if the user's input is incorrect  */
 String s,msg,ww;
 /*Fonts:-
  *Font command creates an individual font object
  *f=sets the font to be dispalyed of size 45 and which is displayed in normal format
  *xy=sets the font to be dispalyed of size 15 and which is displayed in bold format
  *xxx=sets the font to be dispalyed of size 50 and which is displayed in bold format
  *f1==sets the font to be dispalyed of size 18 and which is displayed in italic format */
 Font f=new Font("Serif",Font.PLAIN,45);
 Font xy=new Font("TimesNewRoman",Font.BOLD,15);
 Font xxx=new Font("Serif",Font.BOLD,50);
 Font f1=new Font("Serif",Font.ITALIC+Font.BOLD,18);
 /*Arrays:-
  *z[]=It is an array which stores the name of all the elements
  *zz[]=It is an array which stores the atomic number of all the elements
  *zzz[]=It is an array which stores the symbol of all the elements
  *zzzz[]=It is an array which stores the electronic configuration of all the elements  */
 String z[]= {"Hydrogen","Helium","Lithium","Berrylium","Boron","Carbon","Nitrogen","Oxygen",
               "Fluorine","Neon","Sodium","Magnesium","Aluminium","Silicon","Phosphorus",
               "Sulphur","Chlorine","Argon","Potassium","Calcium","Scandium","Titanium","Vanadium",
               "Chromium","Manganese","Iron","Cobalt","Nickel","Copper","Zinc","Gallium",
               "Germanium","Arsenic","Selenium","Bromine","Krypton","Rubidium","Strontium",
               "Yttrium","Zironium","Niobium","Molybdenum","Technetium","Ruthenium","Rhodium",
               "Palladium","Silver","Cadmium","Indium","Tin","Antimony","Tallurium","Iodine",
               "Xenon","Cesium","Barium","Lanthanum","Cerium","Praseodymium","Neodymium",
               "Promethium","Samarium","Europium","Gadolinium","Terbium","Dysprosium","Holmium",
               "Erbium","Thulium","Ytterbium","Lutetium","Hafnium","Tantalum","Tungsten",
               "Rhenium","Osmium","Iridium","Platinum","Gold","Mercury","Thallium","Lead",
               "Bismuth","Polonium","Astatine","Radon","Francium","Radium","Actinum","Thorium",
               "Protactinium","Uranium","Neptunium","Plutonium","Americium","Curium","Berkelium",
               "Californium","Einstenium","Fermium","Mendelevium","Nobelium","Lawrencium",
               "Rutherfordium","Dubnium","Seaborguim","Bohrium","Hassium","Meitnerium","Ununnilium",
               "Unununium","Ununbium","Ununquadium","Ununhexium","Ununoctium"};
 String zz[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
              "19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34",
              "35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50",
              "51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66",
              "67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82",
              "83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98",
              "99","100","101","102","103","104","105","106","107","108","109","110","111","112",
              "114","116","118"};
 String zzz[]={"H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar",
               "K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br",
               "Kr","Rb","Sr","Y","Zr","Nb","Mo","Te","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb",
               "Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho",
               "Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po",
               "At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md",  
               "No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Uun","Uuu","Uub","Uuq","Uuh","Uuo"};
 String zzzz[]={"1","2","2-1","2-2","2-3","2-4","2-5","2-6","2-7","2-8","2-8-1","2-8-2","2-8-3",
                "2-8-4","2-8-5","2-8-6","2-8-7","2-8-8","2-8-8-1","2-8-8-2","2-8-9-2",
                "2-8-10-2","2-8-11-2","2-8-13-1","2-8-13-2","2-8-14-2","2-8-15-2","2-8-16-2",
                "2-8-18-1","2-8-18-2","2-8-18-3","2-18-8-4","2-8-18-5","2-8-18-6","2-8-18-7",
                "2-8-18-8","2-8-18-8-1","2-8-18-8-2","2-8-18-9-2","2-8-18-10-2","2-8-18-12-1",
                "2-8-18-13-1","2-8-18-13-2","2-8-18-15-1","2-8-18-16-1","2-8-18-18-0","2-8-18-18-1",
                "2-8-18-18-2","2-8-18-18-3","2-8-18-18-4","2-8-18-18-5","2-8-18-18-6","2-8-18-18-7",
                "2-8-18-18-8","2-8-18-18-8-1","2-8-18-18-8-2","2-8-18-18-9-2","2-8-18-20-8-2",
                "2-8-18-21-8-2","2-8-18-22-8-2","2-8-18-23-8-2","2-8-18-24-8-2",
                "2-8-18-25-8-2","2-8-18-25-9-2","2-8-27-8-2","2-8-18-28-8-2",
                "2-8-18-29-8-2","2-8-18-30-8-2","2-8-18-31-8-2","2-8-18-32-8-2","2-8-18-32-9-2",
                "2-8-18-32-10-2","2-8-18-32-11-2","2-8-18-32-12-2","2-8-18-32-13-2","2-8-18-32-14-2",
                "2-8-18-32-15-2","2-8-18-32-16-2","2-8-18-32-18-1","2-8-18-32-18-2","2-8-18-32-18-3",
                "2-8-18-32-18-4","2-8-18-32-18-5","2-8-18-32-18-6","2-8-18-32-18-7","2-8-18-32-18-8",
                "2-8-18-32-18-8-1","2-8-18-32-18-8-2","2-8-18-32-18-9-2","2-8-18-32-18-10-2",
                "2-8-18-32-20-9-2","2-8-18-32-18-21-9-2","2-8-18-32-18-22-9-2","2-8-18-32-24-8-2",
                "2-8-18-32-25-8-2","2-8-18-32-25-9-2","2-8-18-32-27-8-2","2-8-18-32-28-8-2",
                "2-8-18-32-29-8-2","2-8-18-32-30-8-2","2-8-18-32-31-8-2","2-8-18-32-32-8-2",
                "2-8-18-32-32-9-2","2-8-18-32-32-10-2","2-8-18-32-32-11-2","2-8-18-32-32-12-2",
                "2-8-18-32-32-13-2","2-8-18-32-32-14-2","2-8-18-32-32-15-2","2-8-18-32-32-17-1",
                "2-8-18-32-32-18-1","2-8-18-32-32-18-2","2-8-18-32-32-18-4","2-8-18-32-32-18-6",
                "2-8-18-32-32-18-8"};
 //init function is called when any applet begins execution
 public void init()
 {
     //Initializes the text field's width as 12
     text1=new TextField(12);
     //The text field is now displayed in the applet viewer
     add (text1);
     //sets the default text to be displayed in the text field
     text1.setText("");     
 }
 //paint function is called each time applet's output must be redrawn
 //This function has a parameter:-g of graphics type
 public void paint(Graphics g)         
 {
     // r is an integer used to store the position of the input in the array
     // cc is a counter used to display an error message if its value is 111
     int r=200,cc=1;
     /* g.setColor(Color.name of the colour) command sets the colour of the object to be displayed
      * 
      * g.drawString command displays the string
      * 
      * g.drawRect(int distance from left,int distance from the right,int width ,int height)draws
      * an outline of a rectangle 
      * 
      * g.fillRect(int distance from left,int distance from the right,int width ,int height) creates
      * a filled rectangle
      * 
      * g.drawOval(int distance from left,int distance from the right,int width ,int height)draws 
      * an outline of an oval 
      * 
      * g.fillOval(int distance from left,int distance from the right,int width ,int height) creates
      * a filled oval */
     g.setColor(Color.red);
     g.setFont(f1);
     String msg="ENTER THE NAME OR ATOMIC NUMBER OR SYMBOL OF THE ELEMENT";
     setBackground(Color.black);
     g.drawString(msg,185,53);
     //The inputted value is retrieved by using .getText() and stored in the string s
     s=text1.getText();
     g.setFont(xy);
     g.setColor(Color.orange);
     g.fillRect(810,365,30,30);
     g.drawString("Non-Metals",845,385);
     g.setColor(Color.pink);
     g.fillRect(810,275,30,30);
     g.drawString("Noble Gases",845,295);
     g.setColor(Color.white);
     g.fillRect(810,230,30,30);
     g.fillRect(810,275,12,12);
     g.drawString("Alkali Metals",845,250);
     g.setColor(Color.green);
     g.fillRect(810,320,30,30);
     g.drawString("Alkaline Earth Metals",845,340);
     g.setColor(Color.red);
     g.fillRect(810,50,30,30);
     g.fillRect(810,365,12,12);
     g.fillRect(810,185,30,30);
     g.drawString("Metalloids",845,65);
     g.setColor(Color.blue);
     g.fillRect(810,95,30,30);
     g.drawString("Transition Metals",845,115);
     g.setColor(Color.gray);
     g.fillRect(810,230,12,12);
     g.setColor(Color.yellow);
     g.fillRect(810,320,12,12);
     g.fillRect(810,50,12,12);
     g.setColor(Color.green);
     g.fillRect(810,95,12,12);
     g.setColor(Color.lightGray);
     g.fillRect(810,140,30,30);
     g.drawString("Actinide Series",845,160);
     g.setColor(Color.pink);
     g.fillRect(810,185,12,12);
     g.drawString("Lanthanide Series",845,205);
     g.setColor(Color.magenta);
     g.fillRect(810,410,30,30);
     g.drawString("Halogens",845,430);
     g.setColor(Color.white);
     g.fillRect(810,410,12,12);
     g.setColor(Color.gray);
     g.fillRect(810,140,12,12);     
     g.setFont(f);
      for(int i=0;i<=109;i+=1)
     {
         /*Checks the string inputted(s) with the string in an array(z[],zz[],zzz[])
           ignoring the case  */
         if(s.equalsIgnoreCase(z[i])||s.equalsIgnoreCase(zz[i])||s.equals(zzz[i]))
         {
             r=(i+1);
         }
   }
   for(int i=0;i<=109;i+=1)
   {
       if(s.equalsIgnoreCase(z[i])||s.equalsIgnoreCase(zz[i])||s.equals(zzz[i]))
       {
           break;
       }
       else 
       cc+=1;
   }
  if(cc==111&&!s.equals(""))
   {
       g.setFont(xxx);
       g.setColor(Color.white);
       ww="ERROR";
       g.drawString(ww,195,175);
       g.setFont(xy);
       g.drawString("# Please check the spelling of the NAME of the element if entered",195,235);
       g.drawString("# The ATOMIC NUMBER if entered should be between 1 & 110",195,260);
       g.drawString("# Please check the SYMBOL of the element if entered",195,285);
       g.drawString("ENTER THE NAME,SYMBOL OR ATOMIC NUMBER IN THE FOLLOWING FORMAT:-",80,320);
       g.drawString("For Name:  e.g. Sodium or sodium (using any case)",85,345);
       g.drawString("For Atomic Nmber: e.g. 11 (without using decimal form)",85,370);
       g.drawString("For Symbol: e.g. Na ",85,395);
   }
 //*****************************************************************************************     
 if(r>=1&&r<=110)
 {
     g.setColor(Color.white);
     g.drawString("Electronic Configuration:",75,550);
     g.drawString(zzzz[r-1],535,550);
}
   if(r==3||r==11||r==19||r==37||r==55||r==87)
     {
         g.setColor(Color.white);
         g.fillRect(600,250,110,100);
         g.setColor(Color.gray);
         g.fillRect(600,250,25,25);
         if(r==3)
         {
             g.setColor(Color.gray);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.white);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.gray);
             g.drawString(z[r-1],623,325);
         }
         else if(r==11)
         {
             
             g.setColor(Color.gray);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.white);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.gray);
             g.drawString(z[r-1],623,325);
         }
         else if(r==19)
         {
             
             g.setColor(Color.gray);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.white);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.gray);
             g.drawString(z[r-1],623,325);
         }
         else if(r==37)
         {
             
             g.setColor(Color.gray);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.white);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.gray);
             g.drawString(z[r-1],623,325);
         }
         else if(r==55)
         {
             
             g.setColor(Color.gray);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.white);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.gray);
             g.drawString(z[r-1],623,325);
         }
         else if(r==87)
         {
             
             g.setColor(Color.gray);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.white);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.gray);
             g.drawString(z[r-1],623,325);
         }            
     }
///*********************************************************************************************     
     else if(r==4||r==12||r==20||r==38||r==56||r==88)
     {
         g.setColor(Color.green);
         g.fillRect(600,250,110,100);
         g.setColor(Color.yellow);
         g.fillRect(600,250,25,25);
         if(r==4)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.green);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],623,325);
         }
         else if(r==12)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.green);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],620,331);
         }
         else if(r==20)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.green);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],623,325);
         }
         else if(r==38)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.green);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],623,325);
         }
         else if(r==56)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.green);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],623,325);
         }
         else if(r==88)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.green);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],623,325);
         }
     }
 //*****************************************************************************************      
     else if(r==2||r==10||r==18||r==36||r==54||r==86)
     {
         g.setColor(Color.pink);
         g.fillRect(600,250,110,100);
         g.setColor(Color.white);
         g.fillRect(600,250,25,25);
         if(r==2)
         {
             
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==10)
         {
             
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
          else if(r==18)
          {
              
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==36)
         {
             
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==54)
         {
             
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==86)
         {
             
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
     
     }
 //*****************************************************************************************      
     else if(r==5||r==14||r==32|r==33||r==51||r==52||r==84)
     {
         g.setColor(Color.red);
         g.fillRect(600,250,110,100);
         g.setColor(Color.yellow);
         g.fillRect(600,250,25,25);        
         if(r==5)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],627,325);
         }
         else if(r==14)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],627,325);
         }
         else if(r==32)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],623,325);
         }
         else if(r==33)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],627,325);
         }
         else if(r==51)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],627,325);
         }
         else if(r==52)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],627,325);
         }
         else if(r==84)
         {
             
             g.setColor(Color.yellow);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.red);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.yellow);
             g.drawString(z[r-1],627,325);
         }
     }    
 //*****************************************************************************************      
 else if(r==9||r==17||r==35||r==53||r==85)
 {
         g.setColor(Color.magenta);
         g.fillRect(600,250,110,100);
         g.setColor(Color.white);
         g.fillRect(600,250,25,25);        
         if(r==9)
         {
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==17)
         {
             g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==35)
         {
               g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==53)
         {
               g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
         else if(r==85)
         {
               g.setColor(Color.white);
             g.drawString(zzz[r-1],632,310);
             g.setFont(xy);
             g.setColor(Color.pink);
             g.drawString(zz[r-1],605,268);
             g.setColor(Color.white);
             g.drawString(z[r-1],627,325);
         }
     }
  /*Integers:-
   *b= It is the width and height of the  oval drawn
   *j= It is the distance from the top and left to be drawn
   *m= It is the distance from the left to draw an filled oval
   *n= It is the distance from the top to draw a filled oval
   *c= It is the distance from the left to draw a filled oval
   *a= It is the distance from the left to draw a filled oval
   *************************************************************************** */
             
          
     
       int b=76,j=250,m=(248+b),n=222,c=235,a;
       if(r<=2)
     {
          g.setColor(Color.green);
          g.drawOval(j,j,b,b);
           if(r==1)
         {
           g.setColor(Color.yellow);
           g.fillOval(248,288,8,8);       
           g.setColor(Color.orange);
           g.fillRect(600,250,110,100);
           g.setColor(Color.red);
           g.fillRect(600,250,25,25);
           g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],623,325);

         }
 //*****************************************************************************************          
         else if(r==2)
         {
             g.setColor(Color.yellow);
             g.fillOval(j-4,j+(b/2)-2,11,11);
             g.fillOval(j+b-5,j+(b/2)-2,11,11);
        
         }
     }
 //*****************************************************************************************      
     else if(r>2&&r<=10)
     {
         if(r>=6&&r<=8)
         {
           g.setColor(Color.orange);
           g.fillRect(600,250,110,100);
           g.setColor(Color.red);
           g.fillRect(600,250,25,25);
        }
        for(int i=1;i<=2;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;         
      }
      j=250;
      b=76;
 //*****************************************************************************************       
      if(r==3)
      {
          g.setColor(Color.yellow);
          g.fillOval(j-4,j+(b/2)-2,11,11);
          g.fillOval(j+b-5,j+(b/2)-2,11,11);
          g.fillOval(278,j-27,11,11);
  }
 //*****************************************************************************************   
  else if(r==4)
  {
      g.setColor(Color.yellow);
      g.fillOval(j-4,j+(b/2)-2,11,11);
      g.fillOval(j+b-5,j+(b/2)-2,11,11);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
  }
   //***************************************************************************************** 
  else if(r==5)
  {
      g.setColor(Color.yellow);
      g.fillOval(j+b-5,j+(b/2)-2,11,11);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      }
 //*****************************************************************************************       
  else if(r==6)
  {
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
           g.setColor(Color.red);         
           g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],623,325);
     }
 //*****************************************************************************************      
 else if(r==7)
 {
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
       a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
      g.fillOval(j+b,j+b+10,11,11);
      
           g.setColor(Color.red);
           g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],623,325);
     }
 //*****************************************************************************************      
     else if(r==8)
     {
          g.setColor(Color.yellow);
          g.fillOval(281,j-27,11,11);    
          g.fillOval(281,j+b+23,11,11);
          j=250;
          b=76;     
          a=j-4;
          for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     
           g.setColor(Color.red);
           g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],623,325);
 }
 //*****************************************************************************************  
 else if(r==9)
 {
     g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     g.fillOval(j-5,c,11,11);
     
}           
   //***************************************************************************************** 
  else if(r==10)
  {
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
 }
 }
 //*****************************************************************************************  
 else if(r>10&&r<=18)
 {
     if(r>=15&&r<=16)
     {
           g.setColor(Color.orange);
           g.fillRect(600,250,110,100);
           g.setColor(Color.red);
           g.fillRect(600,250,25,25);
       }       
         for(int i=0;i<3;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;         
      }
      j=250;
      b=76;     
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
 //*****************************************************************************************      
     if(r==11)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,200,11,11);
     }
 //*****************************************************************************************      
     else if(r==12)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
     }
 //***************************************************************************************** 
     else if(r==13)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.setColor(Color.blue);
     g.fillRect(600,250,110,100);
     g.setColor(Color.green);
     g.fillRect(600,250,25,25);
     g.setColor(Color.green);
     
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
     }
 //*****************************************************************************************      
     else if(r==14)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.fillOval(375,288,11,11);         
     }     
 //*****************************************************************************************      
     else if(r==15)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.fillOval(375,288,11,11);
         g.fillOval(346,n,11,11);
         g.setColor(Color.red);
           g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],618,325);
         }
 //*****************************************************************************************          
      else if(r==16)
         {
             g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.fillOval(375,288,11,11);
         for(int i=1;i<=2;i+=1)
     {
         g.fillOval(346,n,11,11);
         n+=127;
     }
         g.setColor(Color.red);
         g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],623,325);
     
     }
 //*****************************************************************************************      
     else if(r==17)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.fillOval(375,288,11,11);
         for(int i=1;i<=2;i+=1)
     {
         g.fillOval(346,n,11,11);
         n+=127;
     }
           n=222;
           g.fillOval(225,n,11,11);
       }
  //***************************************************************************************** 
     else if(r==18)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.fillOval(375,288,11,11);
         for(int i=1;i<=2;i+=1)
     {
         g.fillOval(346,n,11,11);
         n+=127;
     }
     n=222;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(225,n,11,11);
         n+=127;
     }
   }}
    //***************************************************************************************** 
   else if(r>18&&r<=29)
   {
       if(r>=21&&r<=29)
       {
           
     g.setColor(Color.blue);
     g.fillRect(600,250,110,100);
     g.setColor(Color.green);
     g.fillRect(600,250,25,25);
 }
       for(int i=1;i<=4;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;
     }
      j=250;
      b=76;     
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
         g.setColor(Color.yellow);
         g.fillOval(280,374,11,11);
         g.fillOval(280,200,11,11);
         g.fillOval(200,288,11,11);
         g.fillOval(375,288,11,11);
         for(int i=1;i<=2;i+=1)
     {
         g.fillOval(346,n,11,11);
         n+=127;
     }
     n=222;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(225,n,11,11);
         n+=127;
     }
 //*****************************************************************************************      
     if(r==19)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,176,11,11);
         
     }
 //*****************************************************************************************      
     else if(r==20)
     {
         g.setColor(Color.yellow);
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);
     }
 //*****************************************************************************************      
     else if(r==21)
     {
         g.setColor(Color.yellow);
         g.fillOval(315,205,11,11);
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11); 
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
     }
 //*****************************************************************************************      
     else if(r==22)
     {
         int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
 }
  //***************************************************************************************** 
 else if(r==23)
 {
         int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);            
         g.fillOval(248,208,11,11);
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
 }
  //***************************************************************************************** 
 else if(r==24)
 {
     int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         y=208;
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);            
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(248,y,11,11);
         y+=160;
     }
     g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
 }
  //***************************************************************************************** 
 else if(r==25)
 {
     int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         y=208;
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);            
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(248,y,11,11);
         y+=160;
     }
         g.fillOval(365,250,11,11);
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
 }
  //***************************************************************************************** 
 else if(r==26)
 {
     int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         y=208;
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);            
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(248,y,11,11);
         y+=160;
     }
     y=250;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(365,y,11,11);
         y+=75;
     }
     g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
 }
  //***************************************************************************************** 
 else if(r==27)
 {
     int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         y=208;
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);            
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(248,y,11,11);
         y+=160;
     }
     y=250;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(365,y,11,11);
         y+=75;
     }
         g.fillOval(206,250,11,11);
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
 }
  //***************************************************************************************** 
 else if(r==28)
 {
          int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         y=208;
         g.fillOval(280,176,11,11);
         g.fillOval(280,402,11,11);            
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(248,y,11,11);
         y+=160;
     }
     y=250;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(365,y,11,11);
         y+=75;
     }
         g.fillOval(206,250,11,11);
         g.fillOval(210,330,11,11); 
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
     }
     else if (r==29)
     {
         
          int y=205;
         g.setColor(Color.yellow);
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(315,y,11,11);
             y+=165;
         }
         y=208;
         g.fillOval(280,176,11,11);
          for(int i=1;i<=2;i+=1)
     {
         g.fillOval(248,y,11,11);
         y+=160;
     }
     y=250;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(365,y,11,11);
         y+=75;
     }
     y=200;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(y,268,11,11);
         y+=173;
     }
         g.fillOval(206,250,11,11);
         g.fillOval(210,330,11,11); 
         g.setColor(Color.green);
         g.drawString(zzz[r-1],632,310);
         g.setFont(xy);
         g.setColor(Color.blue);
         g.drawString(zz[r-1],605,268);
         g.setColor(Color.green);
         g.drawString(z[r-1],623,325);
     }
         
     }
      //***************************************************************************************** 
 else if(r>29&&r<=36)
 {
     if(r>=34&&r<=34)
     {
           g.setColor(Color.orange);
           g.fillRect(600,250,110,100);
           g.setColor(Color.red);
           g.fillRect(600,250,25,25);
       }
         
     for(int i=1;i<=4;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;
     }
      j=250;
      b=76;     
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
     int he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.setColor(Color.yellow);
         g.fillOval(272,he,11,11);
         he+=174;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,288,11,11);
         he+=176;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(300,he,11,11);
         he+=174;
     }
     he=240;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,215,11,11);
         he+=100;
     }
     he=214;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,240,11,11);
         he+=145;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,265,11,11);
         he+=170;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,310,11,11);
         he+=170;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,335,11,11);
         he+=145;
     }
     he=235;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,360,11,11);
         he+=100;
     }
      //***************************************************************************************** 
     if(r==30)
     {
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         
     g.setColor(Color.blue);
     g.fillRect(600,250,110,100);
     g.setColor(Color.green);
     g.fillRect(600,250,25,25);
     g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
     }
      //***************************************************************************************** 
     else if(r==31)
     {
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         he=175;
         for(int i=1;i<=1;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
     }
     g.setColor(Color.blue);
     g.fillRect(600,250,110,100);
     g.setColor(Color.green);
     g.fillRect(600,250,25,25);
     g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
     }
  //***************************************************************************************** 
     else if(r==32)
     {
         
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
     }
    
     }
      //***************************************************************************************** 
     else if(r==33)
     {
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
        }
        g.fillOval(200,220,11,11);
        
 }
  //***************************************************************************************** 
 else if(r==34)
       {     
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
        }
        he=200;
        for(int i=1;i<=2;i+=1)
        {
            g.fillOval(he,220,11,11);
            he+=180;
        }
           g.setColor(Color.red);
           g.drawString(zzz[r-1],632,310);
           g.setFont(xy);
           g.setColor(Color.orange);
           g.drawString(zz[r-1],605,268);
           g.setColor(Color.red);
           g.drawString(z[r-1],623,325);
    }
     //***************************************************************************************** 
    else if(r==35)
    {
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
        }
        he=200;
        for(int i=1;i<=2;i+=1)
        {
            g.fillOval(he,220,11,11);
            he+=180;
        }
        g.fillOval(196,352,11,11);
           
    }
     //***************************************************************************************** 
    else if(r==36)
    {
        he=175;
         for(int i=1;i<=2;i+=1)
         {
           g.fillOval(158+125,he,11,11);
           he+=225;
         }
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
        }
        he=200;
        for(int i=1;i<=2;i+=1)
        {
            g.fillOval(he,220,11,11);
            he+=180;
        }
        he=200;
        for(int i=1;i<=2;i+=1)
        {
            g.fillOval(he,360,11,11);
            he+=180;
        }
    }}
    //******************************************************************************************
    else if(r>36&&r<=47)
    {
        if(r>=39&&r<=47)
        {
            g.setColor(Color.blue);
            g.fillRect(600,250,110,100);
            g.setColor(Color.green);
            g.fillRect(600,250,25,25);
        }
         for(int i=1;i<=5;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;
     }
      j=250;
      b=76;     
      
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
     int he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.setColor(Color.yellow);
         g.fillOval(272,he,11,11);
         he+=174;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,288,11,11);
         he+=176;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(300,he,11,11);
         he+=174;
     }
     he=240;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,215,11,11);
         he+=100;
     }
     he=214;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,240,11,11);
         he+=145;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,265,11,11);
         he+=170;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,310,11,11);
         he+=170;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,335,11,11);
         he+=145;
     }
     he=235;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,360,11,11);
         he+=100;
     }   
      he=175;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(158+125,he,11,11);
             he+=225;
         }
         he=175;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,288,11,11);
             he+=227;
        }
        he=200;
        for(int i=1;i<=2;i+=1)
        {
            g.fillOval(he,220,11,11);
            he+=180;
        }
        he=200;
        for(int i=1;i<=2;i+=1)
        {
            g.fillOval(he,360,11,11);
            he+=180;
        }
         //***************************************************************************************** 
        if(r==37)
        {
            g.fillOval(152,288,11,11);
        }
 //*****************************************************************************************         
        else if(r==38)
        {
            g.fillOval(152,288,11,11);
            g.fillOval(430,288,11,11);
        }
 //*****************************************************************************************         
        else if(r==39)
        {
            g.fillOval(152,288,11,11);
            g.fillOval(430,288,11,11);
            g.fillOval(235,190,11,11);
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
        }
 //*****************************************************************************************         
        else if(r==40)
        {
            
            g.fillOval(152,288,11,11);
            g.fillOval(430,288,11,11);
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
            }
 //*****************************************************************************************             
            else if(r==41)
            {
            g.fillOval(152,288,11,11);
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            g.fillOval(235,390,11,11);
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
            }
 //*****************************************************************************************             
            else if(r==42)
            {
            g.fillOval(152,288,11,11);
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,390,11,11);
                he+=105;
            }
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],618,325);
            }   
 //*****************************************************************************************             
            else if(r==43)
            {
            g.fillOval(152,288,11,11);
            g.fillOval(430,288,11,11);
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,390,11,11);
                he+=105;
            }
            g.fillOval(183,250,11,11);
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],618,325);
        }
 //*****************************************************************************************         
        else if(r==44)
        {
            g.fillOval(152,288,11,11);
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,390,11,11);
                he+=105;
            }
            he=183;
            for(int i=1;i<=2;i+=1)
            {
                 g.fillOval(he,250,11,11);
                 he+=212;
            }
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
        }
 //*****************************************************************************************         
        else if(r==45)
        {
            g.fillOval(152,288,11,11);
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,390,11,11);
                he+=105;
            }
            he=183;
            for(int i=1;i<=2;i+=1)
            {
                 g.fillOval(he,250,11,11);
                 he+=212;
            }
            he=183;
            for(int i=1;i<=1;i+=1)
            {
                g.fillOval(he,325,11,11);
                he+=212;
            }
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
        }
 //*****************************************************************************************         
        else if(r==46)
        {
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,390,11,11);
                he+=105;
            }
            he=183;
            for(int i=1;i<=2;i+=1)
            {
                 g.fillOval(he,250,11,11);
                 he+=212;
            }
            he=183;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,325,11,11);
                he+=212;
            }
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
        }
        else if(r==47)
        {
           
             g.fillOval(152,288,11,11);
             he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,190,11,11);
                he+=105;
            }
            he=235;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,390,11,11);
                he+=105;
            }
            he=183;
            for(int i=1;i<=2;i+=1)
            {
                 g.fillOval(he,250,11,11);
                 he+=212;
            }
            he=183;
            for(int i=1;i<=2;i+=1)
            {
                g.fillOval(he,325,11,11);
                he+=212;
            }
            g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,330);
        }
            
        }
        //***************************************************************************
        else if(r>47&&r<=54)
        {
            
      if(r>=48&&r<=50)
       {
            g.setColor(Color.blue);
     g.fillRect(600,250,110,100);
     g.setColor(Color.green);
     g.fillRect(600,250,25,25);
 }
                
             for(int i=1;i<=5;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;
     }
      j=250;
      b=76;     
      
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
     int he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.setColor(Color.yellow);
         g.fillOval(272,he,11,11);
         he+=174;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,288,11,11);
         he+=176;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(300,he,11,11);
         he+=174;
     }
     he=240;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,215,11,11);
         he+=100;
     }
     he=214;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,240,11,11);
         he+=145;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,265,11,11);
         he+=170;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,310,11,11);
         he+=170;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,335,11,11);
         he+=145;
     }
     he=235;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,360,11,11);
         he+=100;
     } 
     he=181;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(260,he,11,11);
         he+=220;
     }
     he=181;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(310,he,11,11);
         he+=220;
     }
     he=176;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,294,11,11);
         he+=226;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,200,11,11);
         he+=145;
     }
     he=195;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,230,11,11);
         he+=190;
     }
     he=180;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,260,11,11);
         he+=220;
     }
     he=180;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,325,11,11);
         he+=215;
     }
     he=198;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,355,11,11);
         he+=185;
     }
     he=225;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,385,11,11);
         he+=125;
     }
      //***************************************************************************************** 
     if(r==48)
     {
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
     }
      //***************************************************************************************** 
     else if(r==49)
     {
         
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         g.fillOval(280,153,11,11);
         g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
     }
      //***************************************************************************************** 
     else if(r==50)
     {
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(280,he,11,11);
             he+=276;
         }
         g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],633,325);
     }
      //***************************************************************************************** 
     else if(r==51)
     {
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(280,he,11,11);
             he+=276;
         }
         g.fillOval(195,190,11,11);
     }
      //***************************************************************************************** 
     else if(r==52)
     {
         
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(280,he,11,11);
             he+=276;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,190,11,11);
             he+=190;
         }
                 
     }
 //*****************************************************************************************      
     else if(r==53)
     {
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(280,he,11,11);
             he+=276;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,190,11,11);
             he+=190;
         }
         g.fillOval(195,388,11,11);
        
     }
 //*****************************************************************************************      
     else if(r==54)
     {
         he=155;
         for(int i=1;i<=2;i+=1)
         {
             
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(280,he,11,11);
             he+=276;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,190,11,11);
             he+=190;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,388,11,11);
             he+=192;
         }
     }
     }
     //*************************************************************************************
     else if(r>54&&r<=86)
     {
         if(r>=57&&r<=71)
         {
             
     g.setColor(Color.red);
     g.fillRect(600,250,110,100);
     g.setColor(Color.pink);
     g.fillRect(600,250,25,25);
 }
  //***************************************************************************************** 
         if(r>=72&&r<=83)
         {
             g.setColor(Color.blue);
             g.fillRect(600,250,110,100);
             g.setColor(Color.green);
             g.fillRect(600,250,25,25);
         }
         for(int i=1;i<=6;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;
     }
      j=250;
      b=76;     
      
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
     int he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.setColor(Color.yellow);
         g.fillOval(272,he,11,11);
         he+=174;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,288,11,11);
         he+=176;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(300,he,11,11);
         he+=174;
     }
     he=240;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,215,11,11);
         he+=100;
     }
     he=214;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,240,11,11);
         he+=145;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,265,11,11);
         he+=170;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,310,11,11);
         he+=170;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,335,11,11);
         he+=145;
     }
     he=235;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,360,11,11);
         he+=100;
     } 
     he=181;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(260,he,11,11);
         he+=220;
     }
     he=181;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(310,he,11,11);
         he+=220;
     }
     he=176;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,294,11,11);
         he+=226;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,200,11,11);
         he+=145;
     }
     he=195;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,230,11,11);
         he+=190;
     }
     he=180;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,260,11,11);
         he+=220;
     }
     he=180;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,325,11,11);
         he+=215;
     }
     he=198;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,355,11,11);
         he+=185;
     }
     he=225;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,385,11,11);
         he+=125;
     }
     
         he=155;
         for(int i=1;i<=2;i+=1)
         {
 
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
 
             g.fillOval(280,he,11,11);
             he+=276;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,190,11,11);
             he+=190;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,388,11,11);
             he+=192;
         }
 //*****************************************************************************************          
         if(r==55)
         {
             g.fillOval(280,130,11,11);
         }
 //*****************************************************************************************          
         else if(r==56)
         {
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             
         }
 //*****************************************************************************************          
         else if(r==57)
         {
             g.fillOval(230,165,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==58)
         {
             g.fillOval(280,175,11,11);
             g.fillOval(230,165,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==59)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.setColor(Color.yellow);
             g.fillOval(235,188,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],600,325);
         }
 //*****************************************************************************************          
         else if(r==60)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],618,325);
         }
 //*****************************************************************************************          
         else if(r==61)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             g.fillOval(205,215,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],617,325);

         }
 //*****************************************************************************************          
         else if(r==62)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
             }
 //*****************************************************************************************              
             else if(r==63)
             {
                      he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             g.fillOval(185,245,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
             }
 //*****************************************************************************************              
             else if(r==64)
             {
                         he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==65)
         {
                         he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             g.fillOval(175,275,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==66)
         {
                         he=175;
             for(int i=1;i<=2;i+=1)
             {        
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],618,333);
         }
 //*****************************************************************************************          
         else if(r==67)
         {
             
                         he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             g.fillOval(178,310,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==68)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==69)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {          
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             g.fillOval(187,340,11,11);
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==70)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==71)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
         g.fillOval(230,170,11,11);
         g.setColor(Color.pink);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.red);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.pink);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==72)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==73)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             g.fillOval(230,415,11,11);
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==74)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==75)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             g.fillOval(160,245,11,11);
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==76)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==77)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             g.fillOval(160,330,11,11);
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==78)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==79)
         {
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             g.fillOval(170,360,11,11);
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],635,325);
         }
 //*****************************************************************************************          
         else if(r==80)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,333);
         }
 //*****************************************************************************************          
         else if(r==81)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             g.fillOval(130,290,11,11);
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==82)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             he=130;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,290,11,11);
                 he+=326;
             }
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==83)
         {
             
             he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             he=130;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,290,11,11);
                 he+=326;
             }
             g.fillOval(175,180,11,11);
             g.setColor(Color.green);
     g.drawString(zzz[r-1],632,310);
     g.setFont(xy);
     g.setColor(Color.blue);
     g.drawString(zz[r-1],605,268);
     g.setColor(Color.green);
     g.drawString(z[r-1],623,325);
         }
 //*****************************************************************************************          
         else if(r==84)
         {
               he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             he=130;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,290,11,11);
                 he+=326;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,180,11,11);
                 he+=235;
             }
         }
 //*****************************************************************************************          
         else if(r==85)
         {
             
               he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             he=130;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,290,11,11);
                 he+=326;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,180,11,11);
                 he+=235;
             }
             g.fillOval(175,405,11,11);
            
         }
 //*****************************************************************************************          
         else if(r==86)
         {
             
               he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             he=130;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,290,11,11);
                 he+=326;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,180,11,11);
                 he+=235;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,405,11,11);
                 he+=235;
             }
         } 
         }
//*********************************************************************************************
         else if(r>86&&r<=110)
         {
 //*****************************************************************************************              
             if(r>=89&&r<=102)
             {
                 g.setColor(Color.lightGray);
                 g.fillRect(600,250,110,100);
                 g.setColor(Color.gray);
                 g.fillRect(600,250,28,25);
             }
 //*****************************************************************************************              
             if(r>=103&&r<=110)
             {
                 g.setColor(Color.blue);
     g.fillRect(600,250,110,100);
     g.setColor(Color.green);
     g.fillRect(600,250,33,25);
 }
                 
             g.setFont(f);
             for(int i=1;i<=7;i+=1)
     {
         g.setColor(Color.green);
         g.drawOval(j,j,b,b);
         b+=50;
         j-=23;
     }
      j=250;
      b=76;     
      
      g.setColor(Color.yellow);
      g.fillOval(281,j-27,11,11);    
      g.fillOval(281,j+b+23,11,11);
      j=250;
      b=76;     
      a=j-4;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(a,j+(b/2),11,11); 
          a-=25;
      }
      j=250;
      b=76;     
      int v=(j+b)-5;
      for(int i=1;i<=2;i+=1)
      {
          g.fillOval(v,j+(b/2),11,11);
          v+=25;
      }
      j=250;
      b=76;     
           for(int i=0;i<2;i+=1)
     {
         g.fillOval(m,c,11,11);
         c+=103;
     }
     c=235;
     for(int i=0;i<2;i+=1)
     {
         g.fillOval(246,c,11,11);
         c+=103;
     }
     int he=200;
     for(int i=1;i<=2;i+=1)
     {
         g.setColor(Color.yellow);
         g.fillOval(272,he,11,11);
         he+=174;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,288,11,11);
         he+=176;
     }
     he=200;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(300,he,11,11);
         he+=174;
     }
     he=240;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,215,11,11);
         he+=100;
     }
     he=214;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,240,11,11);
         he+=145;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,265,11,11);
         he+=170;
     }
     he=203;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,310,11,11);
         he+=170;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,335,11,11);
         he+=145;
     }
     he=235;
     for(int i=1;i<=2;i+=1)
     {

         g.fillOval(he,360,11,11);
         he+=100;
     } 
     he=181;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(260,he,11,11);
         he+=220;
     }
     he=181;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(310,he,11,11);
         he+=220;
     }
     he=176;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,294,11,11);
         he+=226;
     }
     he=215;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,200,11,11);
         he+=145;
     }
     he=195;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,230,11,11);
         he+=190;
     }
     he=180;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,260,11,11);
         he+=220;
     }
     he=180;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,325,11,11);
         he+=215;
     }
     he=198;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,355,11,11);
         he+=185;
     }
     he=225;
     for(int i=1;i<=2;i+=1)
     {
         g.fillOval(he,385,11,11);
         he+=125;
     }
     
         he=155;
         for(int i=1;i<=2;i+=1)
         {
 
             g.fillOval(he,288,11,11);
             he+=275;
         }
         he=153;
         for(int i=1;i<=2;i+=1)
         {
 
             g.fillOval(280,he,11,11);
             he+=276;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,190,11,11);
             he+=190;
         }
         he=195;
         for(int i=1;i<=2;i+=1)
         {
             g.fillOval(he,388,11,11);
             he+=192;
         }
          he=175;
             for(int i=1;i<=2;i+=1)
             {   
                 g.fillOval(283,he,11,11);
                 he+=228;
             }
             g.fillOval(235,190,11,11); 
             g.fillOval(330,186,11,11);
             g.fillOval(280,130,11,11);
             g.fillOval(280,455,11,11);
             he=205;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,215,11,11);
                 he+=170;
             }
             he=185;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=207;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,275,11,11);
                 he+=226;
             }
             he=178;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,310,11,11);
                 he+=222;
             }
             he=187;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,340,11,11);
                 he+=202;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,170,11,11);
                 he+=125;
             }
             he=230;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,415,11,11);
                 he+=125;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,245,11,11);
                 he+=260;
             }
             he=160;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,330,11,11);
                 he+=263;
             }
             he=170;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,360,11,11);
                 he+=240;
             }
             he=130;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,290,11,11);
                 he+=326;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,180,11,11);
                 he+=235;
             }
             he=175;
             for(int i=1;i<=2;i+=1)
             {
                 g.fillOval(he,405,11,11);
                 he+=235;
             }
 //*****************************************************************************************              
             if(r==87)
             {
                 g.fillOval(280,107,11,11);
             }
 //*****************************************************************************************              
             else if(r==88)
             {
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
             }
 //*****************************************************************************************              
             else if(r==89)
             {
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 g.fillOval(215,150,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
             }
 //*****************************************************************************************              
             else if(r==90)
             {
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=215;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,150,11,11);
                     he+=155;
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
             }
 //*****************************************************************************************              
             else if(r==91)
             {
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=215;
                 g.setColor(Color.yellow);
                 g.fillOval(215,150,11,11);
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);

             }
 //*****************************************************************************************              
             else if(r==92)
             {
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=215;
                 g.setColor(Color.yellow);
                 g.fillOval(215,150,11,11);
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 g.fillOval(255,425,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
             }
 //*****************************************************************************************              
             else if(r==93)
             {
                 
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=215;
                 g.setColor(Color.yellow);
                 g.fillOval(215,150,11,11);
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,330);
                 
             }
 //*****************************************************************************************              
             else if(r==94)
             {
                 
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
             }
 //*****************************************************************************************              
             else if(r==95)
             {
                 
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 g.fillOval(155,265,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==96)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 g.fillOval(215,150,11,11);
                 g.fillOval(155,265,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==97)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 g.fillOval(155,310,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==98)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==99)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 g.fillOval(165,345,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],605,268);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==100)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],600,268);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==101)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 g.fillOval(183,377,11,11);
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],600,268);
                 g.drawString(z[r-1],612,325);
                }
 //*****************************************************************************************                 
                else if(r==102)
                {
                    
                 he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 g.setColor(Color.darkGray);
                 g.drawString(zzz[r-1],625,310);
                 g.setFont(xy);
                 g.drawString(zz[r-1],600,268);
                 g.drawString(z[r-1],620,325);
                }
 //*****************************************************************************************                 
                else if(r==103)
                {
                    he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 g.fillOval(210,150,11,11);
                 g.setColor(Color.green);
                 g.drawString(zzz[r-1],632,310);
                 g.setFont(xy);
                 g.setColor(Color.blue);
                 g.drawString(zz[r-1],605,268);
                 g.setColor(Color.green);
                 g.drawString(z[r-1],620,325);
                }
 //*****************************************************************************************                 
                else if(r==104)
                {
                    
                    he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                  g.setColor(Color.green);
                  g.drawString(zzz[r-1],632,310);
                  g.setFont(xy);
                  g.setColor(Color.blue);
                  g.drawString(zz[r-1],605,268);
                  g.setColor(Color.green);
                  g.drawString(z[r-1],604,325);
                }
 //*****************************************************************************************                 
                else if(r==105)
                {
                    
                    he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                 g.fillOval(210,432,11,11);
                 g.setColor(Color.green);
                 g.drawString(zzz[r-1],632,310);
                 g.setFont(xy);
                 g.setColor(Color.blue);
                 g.drawString(zz[r-1],605,268);
                 g.setColor(Color.green);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==106)
                {
                    
                    he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,432,11,11);
                     he+=165;
                 }
                  g.setColor(Color.green);
                  g.drawString(zzz[r-1],632,310);
                  g.setFont(xy);
                  g.setColor(Color.blue);
                  g.drawString(zz[r-1],605,268);
                  g.setColor(Color.green);
                  g.drawString(z[r-1],620,332);
                }
 //*****************************************************************************************                 
                else if(r==107)
                {
                    
                    he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,432,11,11);
                     he+=165;
                 }
                 g.fillOval(140,240,11,11);
                 g.setColor(Color.green);
                 g.drawString(zzz[r-1],632,310);
                 g.setFont(xy);
                 g.setColor(Color.blue);
                 g.drawString(zz[r-1],605,268);
                 g.setColor(Color.green);
                 g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==108)
                {
                       he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.setColor(Color.yellow);
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,432,11,11);
                     he+=165;
                 }
                 he=140;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,240,11,11);
                     he+=305;
                 }
                  g.setColor(Color.green);
                  g.drawString(zzz[r-1],632,310);
                  g.setFont(xy);
                  g.setColor(Color.blue);
                  g.drawString(zz[r-1],605,268);
                  g.setColor(Color.green);
                  g.drawString(z[r-1],623,325);
                }
 //*****************************************************************************************                 
                else if(r==109)
                {
                  he=107;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(280,he,11,11);
                     he+=375;
                 }
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,432,11,11);
                     he+=165;
                 }
                 he=140;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,240,11,11);
                     he+=305;
                }
                g.fillOval(135,335,11,11);
                g.setColor(Color.green);
                g.drawString(zzz[r-1],632,310);
                g.setFont(xy);
                g.setColor(Color.blue);
                g.drawString(zz[r-1],605,268);
                g.setColor(Color.green);
                g.drawString(z[r-1],623,325);
    }
 //*****************************************************************************************     
 else if(r==110)
 {
                 g.fillOval(280,107,11,11);
                 he=250;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,160,11,11);
                     he+=75;
                                       
                 }
                 he=255;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,425,11,11);
                     he+=70;
                 }
                 he=170;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,220,11,11);
                     he+=240;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,265,11,11);
                     he+=270;
                 }
                 he=155;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,310,11,11);
                     he+=272;
                 }
                 he=165;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,345,11,11);
                     he+=255;
                 }
                 he=183;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,377,11,11);
                     he+=218;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,150,11,11);
                     he+=165;
                 }
                 he=210;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,432,11,11);
                     he+=165;
                 }
                 he=140;
                 for(int i=1;i<=2;i+=1)
                 {
                     g.fillOval(he,240,11,11);
                     he+=305;
                }
                g.fillOval(335,135,11,11);
                g.fillOval(240,137,11,11);           
                g.fillOval(135,335,11,11);
                g.setColor(Color.green);
                g.drawString(zzz[r-1],632,310);
                g.setFont(xy);
                g.setColor(Color.blue);
                g.drawString(zz[r-1],605,268);
                g.setColor(Color.green);
                g.drawString(z[r-1],623,325);
            }
//*******************************************************************************************
      
            
}}
         /* action() is used to intercept an event such that when a user after typing the input
          * presses Enter on the keyboard the action is triggered and input is retrieved */
         // Every action returns true if action is triggered or returns false   
  
            public boolean action(Event e,Object ob)
         {
             repaint();
             return true;
         }
     }