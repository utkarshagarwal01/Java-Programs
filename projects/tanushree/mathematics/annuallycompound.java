import java.io.*;

public class annuallycompound
{BufferedReader in=new BufferedReader (new InputStreamReader(System.in));    
void interest() throws IOException
        {
	   System.out.println("In case you dont know the value enter nil ");
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
	       double A=P*(Math.pow((1+(r/100)),t));
	       double I=A-P;
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
	       double P=(A*Math.pow(100,t))/Math.pow((100+r),t);
	       double I=A-P;
	    System.out.println("Interest="+I);
	   } 
	   else
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double A=Double.parseDouble(a);
	       double I=A-P;
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
	       double A=P+I;
	       
	       double r=(Math.pow((A/P),(1/t))-1)*100;
	    System.out.println("Rate="+r);
	   } 
	  else  if(i.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       
	       double r=(Math.pow((A/P),(1/t))-1)*100;
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
	       double r=(Math.pow((A/P),(1/t))-1)*100;
	    System.out.println("Rate="+r);
	   } 
	   else
	   {
	       double I=Double.parseDouble(i);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double A=Double.parseDouble(a);
	        double r=(Math.pow((A/P),(1/t))-1)*100;
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
	       double A=P+I;
	       double x1=(100+r)/100;
	       double x=A/P;
	       double t=1;
	        double se=x1;
	       while(x1<x)
	       {
	           se=se*x1;
	           t++;
	           if(se==x)
	           {
	               break;
	           }
	       }
	       
	    System.out.println("Time="+t+"years");
	   } 
	  else  if(i.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double r=Double.parseDouble(R);
	       double P=Double.parseDouble(p);
	        double x1=(100+r)/(double)100;
	       double x=A/(double)P;
	       double t=1;
	       double se=x1;
	       while(x1<x)
	       {
	           se=se*x1;
	           t++;
	           if(se==x)
	           {
	               break;
	           }
	       }
	       
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
	        double x1=(100+r)/100;
	       double x=A/P;
	       double t=1;
	       double se=x1;
	       while(x1<x)
	       {
	            se=se*x1;
	           t++;
	           if(se==x)
	           {
	               break;
	           }
	       }
	       
	     System.out.println("Time="+t+" years");
	   } 
	   else
	   {
	       double I=Double.parseDouble(i);
	       double r=Double.parseDouble(R);
	       double P=Double.parseDouble(p);
	       double A=Double.parseDouble(a);
	       double x1=(100+r)/100;
	       double x=A/P;
	       double t=1;
	       double se=x1;
	       while(x1<x)
	       {
	            se=se*x1;
	           t++;
	           if(se==x)
	           {
	               break;
	           }
	       }
	   System.out.println("Time="+t+" years");
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
	       double x=Math.pow((1+(r/100)),t)-1;
	       double p=I/x;
	    System.out.println("Principal"+p);
	   } 
	  else  if(i.equalsIgnoreCase("nil"))
	   {
	       double A=Double.parseDouble(a);
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double x=Math.pow(1+(r/100),t);
	       double P=A/x;
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
	        double x=Math.pow((1+(r/100)),t)-1;
	       double P=I/x;
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
	       
	       double A=P*(Math.pow((1+(r/100)),t));
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
	       double x=Math.pow((1+(r/100)),t)-1;
	       double P=I/x;
	       double A=P+I;
	   System.out.println("Amount="+A);
	   } 
	   else
	   {
	       double r=Double.parseDouble(R);
	       double t=Double.parseDouble(n);
	       double P=Double.parseDouble(p);
	       double I=Double.parseDouble(i);
	       double A=P*(Math.pow((1+(r/100)),t));
	       
	    System.out.println("Amount="+A);
	   }
	       
	   }
	}
	
	   
	    