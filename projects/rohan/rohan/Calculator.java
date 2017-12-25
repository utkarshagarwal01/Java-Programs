import java.awt.event.*;
import java.awt.*;
import java.applet.*;

/**
 * Calculator - A simple applet that takes input from a text field 
 * and finds log,antlog,root,reciprocal,factorial,square,cube.etc in response to user button selection. 
 * Works well with a width of 250 and height of 390.  It uses the default
 * layout (FlowLayout) so different sizing will alter the appearance.
 */

public class Calculator extends Applet implements ActionListener
{
    // instance variables - replace the example below with your own
    private TextField inputField;
    private  String LOG = "LOG";
    private  String ANTILOG = "ANTILOG";
    private  String CLS = "CLEAR";
    private  String ROOT = "SQRT";
    private  String RECIPROCAL = "1/N";
    private  String FACTORIAL = "N!";
    private  String SQUARE = "N^2";
    private  String CUBE = "N^3";
    private  String ADD = "  +  ";
    private  String SUB = "  -  ";
    private  String MULTIPLY = "  *  ";
    private  String DIVIDE = "  /  ";
    private  String EQUAL = "  =  ";
    double copy=0;
    int count=0;
        
    /**
     * Called by the browser or applet viewer to inform this Applet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void paint(Graphics g)//method for setting background
	{
	    
	    int x=0,y=500,i,i1;
		setBackground(Color.orange);
	}
    public void init()
    {
        setLayout(null);
        // provide any initialisation necessary for your Applet
        setForeground(Color.red);
        Label l=new Label("CALCULATOR");
        l.setBounds(150,5,84,25);
        add(l);
        setForeground(Color.black);
        inputField = new TextField(40);
        inputField.setBounds(10,45,300,24);
        add(inputField);
        setForeground(Color.blue);
        Button clear = new Button(CLS);
        clear.setBounds(325,45,50,25);
        clear.addActionListener(this);
        add(clear);
        setForeground(Color.magenta);
        Button log = new Button(LOG);
        log.setBounds(10,85,50,25);
        log.addActionListener(this);
        add(log);
        Button antilog = new Button(ANTILOG);
        antilog.setBounds(85,85,60,25);
        antilog.addActionListener(this); 
        add(antilog);
        Button root = new Button(ROOT);
        root.setBounds(10,125,50,25);
        root.addActionListener(this);
        add(root);
        Button rec = new Button(RECIPROCAL);
        rec.setBounds(85,125,60,25);
        rec.addActionListener(this);
        add(rec);
        Button fact = new Button(FACTORIAL);
        fact.setBounds(10,165,50,25);
        fact.addActionListener(this);
        add(fact);
        Button sq = new Button(SQUARE);
        sq.setBounds(85,165,60,25);
        sq.addActionListener(this);
        add(sq);
        Button cub = new Button(CUBE);
        cub.setBounds(50,205,50,25);
        cub.addActionListener(this);
        add(cub);
        setForeground(Color.blue);
        Button add = new Button(ADD);
        add.setBounds(220,85,50,25);
        add.addActionListener(this);
        add(add);
        Button sub = new Button(SUB);
        sub.setBounds(310,85,50,25);
        sub.addActionListener(this);
        add(sub);
        Button mul = new Button(MULTIPLY);
        mul.setBounds(220,125,50,25);
        mul.addActionListener(this);
        add(mul);
        Button div = new Button(DIVIDE);
        div.setBounds(310,125,50,25);
        div.addActionListener(this);
        add(div);
        Button eq = new Button(EQUAL);
        eq.setBounds(265,165,50,25);
        eq.addActionListener(this);
        add(eq);
    }

 
    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String .
     */

    /**
     * ActionListener Interface method.
     * Called when action events occur with registered components that
     * can fire action events.
     * @param  ae   the ActionEvent object created by the event
     */
    
    public void actionPerformed(ActionEvent ae)
    {
        String command = ae.getActionCommand();
        // if clear button pressed
        if(CLS.equals(command))
        inputField.setText("");
        String s="";                 //strings for storing coresponding result
	    String str=inputField.getText();//storing input number in string
        double n=Double.parseDouble(str);
        double r;
        // if log button pressed
        if(LOG.equals(command))
        {
            if(n<=0)
            inputField.setText("INVALID INPUT FOR FUNCTION");
            else
            {
            Log o1=new Log();              //calling log class for log 
	        r=o1.cal(n);
	        s=Double.toString(r);          //calculating log
            inputField.setText(s); 
            }
        }
        // if antilog button pressed
        if(ANTILOG.equals(command))
        {
            antilog o=new antilog();              //calling log class for antilog 
	        r=o.cal(n);
	        s=Double.toString(r);          //calculating antilog
            inputField.setText(s);
        }
        // if root button pressed
        if(ROOT.equals(command))
        {
            if(n<0)
            inputField.setText("INVALID INPUT FOR FUNCTION");
            else if(n>100000000)
            inputField.setText("NUMBER IS TOO LARGE");
            else
            {
            squareroot o=new squareroot();           //calling root class for root
	        r=o.cal(n);
	        s=Double.toString(r);        //calculating sqrt
            inputField.setText(s);
            }
        }
        // if reciprocal button pressed
        if(RECIPROCAL.equals(command))
        {
            r=1/n;
            s=Double.toString(r);        //calculating reciprocal
            inputField.setText(s);
        }
        // if factorial button pressed
        if(FACTORIAL.equals(command))
        {
            if(n<0)
            inputField.setText("INVALID INPUT FOR FUNCTION");
            else
            {
            long i,f=1;
            for(i=1;i<=n;i++)
		    f=f*i;                        //calculating factorial
		    s=Double.toString(f);
            inputField.setText(s);
            }
        }
        // if square button pressed
        if(SQUARE.equals(command))
        {
            r=n*n;                        //calculating square
            s=Double.toString(r);        
            inputField.setText(s);
        }
        // if cube button pressed
        if(CUBE.equals(command))
        {
            r=n*n*n;                      //calculating cube
            s=Double.toString(r);
            inputField.setText(s);       
        }
        // if add button pressed
        if(ADD.equals(command))
        {
        copy=n;                           //copying number
        count=1;
        inputField.setText("");
        }
        // if sub button pressed
        if(SUB.equals(command))
        {
        copy=n;                           //copying number
        count=2;
        inputField.setText("");
        }
        // if multiply button pressed
        if(MULTIPLY.equals(command))
        {
        copy=n;                           //copying number
        count=3;
        inputField.setText("");
        }
        // if divide button pressed
        if(DIVIDE.equals(command))
        {
        copy=n;                            //copying number
        count=4;
        inputField.setText("");
        }
        // if equal button pressed
        if(EQUAL.equals(command))
        {
        if(count==1)                        //addition
        copy+=n;
        else if(count==2)
        copy-=n;                            //subtraction
        else if(count==3)
        copy*=n;                            //multipication
        else 
        copy/=n;                            //division                  
        s+=copy;                          
        inputField.setText(s);
        }
    }  
}