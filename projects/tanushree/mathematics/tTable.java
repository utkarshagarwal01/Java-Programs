
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class tTable extends JFrame 
{ 
BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
public JPanel topPanel;
public JTable table;
public JScrollPane scrollPane;


public tTable() throws IOException
{

setTitle( "Savings Bank Account Passbook Entries" );
setSize( 400, 200 );
setBackground( Color.white );


topPanel = new JPanel();
topPanel.setLayout( new BorderLayout() );
getContentPane().add( topPanel );


String columnNames[] = { "Date", "Particulars", "Withdrawl","Deposit","Balance" };
int s=columnNames.length;

String months[]={"jan","feb","mar","apr","may","jun","jul",
"aug","sep","oct","nov","dec"};
System.out.println("please Enter the Month in which interest is calculated");
	    String month=in.readLine();
	    System.out.println("Enter starting month");
	    String month1=in.readLine();
	    String f=month1;
	    int a=0; int b=0;
	    for(int k=0; k<12; k++)
	    {
               if(months[k].equalsIgnoreCase(month1.substring(0,3)))
               {
                   a=k;
               }
               if(months[k].equalsIgnoreCase(month.substring(0,3)))
               {
                   b=k;
               }
           }
          int  n=b-a;
           n=n*31;
String dataValues[][] =new String[n][s];
data inp=new data();
int aa[]= new int[1];
double balance[]=new double[1];
dataValues=inp.input(n,s, f,aa,balance);
table = new JTable( dataValues, columnNames );
scrollPane = new JScrollPane( table );
topPanel.add( scrollPane, BorderLayout.CENTER );


}

//minimum_balance ob=new minimum_balance();
//ob.min(dataValues,a,b,aa,balance);




}



