
import java.io.*;
public class simple
{ 
BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	void interest()throws IOException
	{  System.out.println("In case you dont know the value enter nil ");
	    System.out.println("please Enter Principal");
	    String p=in.readLine();
	   System.out.println("please Enter rate");
	   String R=in.readLine();
	   System.out.println("please Enter time in years");
	   String n=in.readLine();
	   System.out.println("please Enter amount");
	   String a=in.readLine();
	   if(a.equalsIgnoreCase("nil"))
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double I=P*r*t/(double)100;
	    System.out.println("Interest="+I);
	   } 
	  else  if(R.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double I=A-P;
	    System.out.println("Interest="+I);
	   } 
	   else if(n.equalsIgnoreCase("nil"))
	   {
	       double r=Double.parseDouble(R);
	       double A=Double.parseDouble(a);
	       double P=Double.parseDouble(p);
	       double I=A-P;
	    System.out.println("Interest="+I);
	   } 
	   else if(p.equalsIgnoreCase("nil"))
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double A=Double.parseDouble(a);
	       double P=(A*100)/(100+(r*t));
	       double I=(P*r*t)/100;
	    System.out.println("Interest="+I);
	   } 
	   else
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double A=Double.parseDouble(a);
	       double I=P*r*t/100;
	    System.out.println("Interest="+I);
	       
	   }
	}
	       
	    void rate()throws IOException
	    {
	        
	    System.out.println("In case you dont know the value enter nil ");
	    System.out.println("please Enter Principal");
	    String p=in.readLine();
	   System.out.println("please Enter Interest");
	   String i=in.readLine();
	   System.out.println("please Enter time in years");
	   String n=in.readLine();
	   System.out.println("please Enter amount");
	   String a=in.readLine();
	   if(a.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double r=(100*I)/(P*t);
	    System.out.println("Rate="+r);
	   } 
	  else  if(i.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double I=A-P;
	       double r=(100*I)/(P*t);
	    System.out.println("Rate="+r);
	   } 
	   else if(n.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double A=Double.parseDouble(a);
	       double P=Double.parseDouble(p);
	       System.out.println("Cannot determine");
	   } 
	   else if(p.equalsIgnoreCase("nil"))
	   {
	       double I =Double.parseDouble(i);
	       double t=Double.parseDouble(n);
	       double A=Double.parseDouble(a);
	       double P=A-I;
	       double r=(100*I)/(P*t);
	    System.out.println("Rate="+r);
	   } 
	   else
	   {
	       double I=Double.parseDouble(i);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double A=Double.parseDouble(a);
	       double r=(100*I)/(P*t);
	   System.out.println("Rate="+r);
	        
	  }    
	  
	   }
	   
	    void time()throws IOException
	   {
	      
	      System.out.println("In case you dont know the value enter nil ");
	    System.out.println("please Enter Principal");
	    String p=in.readLine();
	   System.out.println("please Enter Interest");
	   String i=in.readLine();
	   System.out.println("please rate");
	   String R=in.readLine();
	   System.out.println("please Enter amount");
	   String a=in.readLine();
	   if(a.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double r=Double.parseDouble(R);
	       double P=Double.parseDouble(p);
	       double t=(100*I)/(P*r);
	    System.out.println("Time="+t+"years");
	   } 
	  else  if(i.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double r=Double.parseDouble(R);
	       double P=Double.parseDouble(p);
	       double I=A-P;
	       double t=(100*I)/(P*r);
	     System.out.println("Time="+t+"years");
	   } 
	   else if(R.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double A=Double.parseDouble(a);
	       double P=Double.parseDouble(p);
	        System.out.println("Cannot determine");
	   } 
	   else if(p.equalsIgnoreCase("nil"))
	   {
	       double I =Double.parseDouble(i);
	       double r=Double.parseDouble(R);
	       double A=Double.parseDouble(a);
	       double P=A-I;
	       double t=(100*I)/(P*r);
	     System.out.println("Time="+t+"years");
	   } 
	   else
	   {
	       double I=Double.parseDouble(i);
	       double r=Double.parseDouble(R);
	       double P=Double.parseDouble(p);
	       double A=Double.parseDouble(a);
	       double t=(100*I)/(P*r);
	   System.out.println("Time="+t+"years");
	 }    
	      
	      
	 }
	 
	 
	  void principal()throws IOException
	   {
	       
	       System.out.println("In case you dont know the value enter nil ");
	    System.out.println("please Enter time");
	    String n=in.readLine();
	   System.out.println("please Enter Interest");
	   String i=in.readLine();
	   System.out.println("please rate");
	   String R=in.readLine();
	   System.out.println("please Enter amount");
	   String a=in.readLine();
	   if(a.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double p=(100*I)/(t*r);
	    System.out.println("Principal"+p);
	   } 
	  else  if(i.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=(A*100)/(100+(r*t));
	     System.out.println("Principal"+P);
	   } 
	   else if(R.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double A=Double.parseDouble(a);
	       double t=Double.parseDouble(n);
	       double P=A-I;
	        System.out.println("Principal"+P);
	   } 
	   else if(n.equalsIgnoreCase("nil"))
	   {
	       double I =Double.parseDouble(i);
	       double r=Double.parseDouble(R);
	       double A=Double.parseDouble(a);
	       double P=A-I;
	       
	    System.out.println("Principal"+P);
	   } 
	   else
	   {
	       double I=Double.parseDouble(i);
	       double t=Double.parseDouble(n);
	       double r=Double.parseDouble(R);
	       double A=Double.parseDouble(a);
	       double P=(100*I)/(t*r);
	   System.out.println("Principal"+P);
	       
	       
	    }
	}
	void amount() throws IOException
	{
	     System.out.println("In case you dont know the value enter nil ");
	    System.out.println("please Enter Principal");
	    String p=in.readLine();
	   System.out.println("please Enter rate");
	   String R=in.readLine();
	   System.out.println("please Enter time in years");
	   String n=in.readLine();
	   System.out.println("please Enter Interest");
	   String i=in.readLine();
	   if(i.equalsIgnoreCase("nil"))
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double I=P*r*t/(double)100;
	       double A=P+I;
	    System.out.println("Amount="+A);
	   } 
	  else  if(R.equalsIgnoreCase("nil"))
	   {
	       double I=Double.parseDouble(i);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double A=P+I;
	    System.out.println("Amount="+A);
	   } 
	   else if(n.equalsIgnoreCase("nil"))
	   {
	       double r=Double.parseDouble(R);
	       double I=Double.parseDouble(i);
	       double P=Double.parseDouble(p);
	       double A=P+I;
	     System.out.println("Amount="+A);
	   } 
	   else if(p.equalsIgnoreCase("nil"))
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double I=Double.parseDouble(i);
	       double P=(I*100)/(r*t);
	       double A=P+I;
	   System.out.println("Amount="+A);
	   } 
	   else
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double I=Double.parseDouble(i);
	       
	       double A=I+P;
	    System.out.println("Amount="+A);
	   }
	       
	   }
	}
	
	   
	    