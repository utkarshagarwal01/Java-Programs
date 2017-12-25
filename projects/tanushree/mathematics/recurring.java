import java.io.*;
public class recurring
{
BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	void rec() throws IOException
	{
	    System.out.println("What do u wish to calculate: Interest, Amount, rate, Monthly Installment, Time");
	    String ch=in.readLine();
	     if(ch.equalsIgnoreCase("Interest"))
	    {
	        
	        System.out.println("In case you dont know the value enter nil ");
	        System.out.println("please Enter Monthly Installment");
	        String mi=in.readLine();
	        System.out.println("please Enter rate");
	        String R=in.readLine();
	        System.out.println("please Enter time in years");
	        String n=in.readLine();
	        System.out.println("please Enter amount");
	        String a=in.readLine();
	        if(a.equalsIgnoreCase("nil"))
	        {
	        double r=Double.parseDouble(R);
	        double MI=Double.parseDouble(mi);
	        double t=Double.parseDouble(n);
	        t=t*12;
	        
	        double P=(MI*t*(t+1))/2;
	        double i=(P*r)/(12*100);
	         System.out.println("Interest="+i);
	       }
	       else if(R.equalsIgnoreCase("nil"))
	        {    
	            double am=Double.parseDouble(a);
	             double MI=Double.parseDouble(mi);
	             double t=Double.parseDouble(n);
	             t=t*12;
	             double d=t*MI;
	             double i=am-d;
	            
	             System.out.println("Interest="+i);
	        }
	        else if(mi.equalsIgnoreCase("nil"))
	        {
	            double am=Double.parseDouble(a);
	            double t=Double.parseDouble(n);
	            double r=Double.parseDouble(R);
	            t=t*12;
	              double MI=(am*2*12*100)/((t*(t+1)*r)+(2*12*100));
	              double P=(MI*t*(t+1))/2;
	              double i=(P*r)/(12*100);
	             System.out.println("Interest="+i);
	         }
	         else if(n.equalsIgnoreCase("nil"))
	         {   
	            double am=Double.parseDouble(a);
	            double MI=Double.parseDouble(mi);
	            double r=Double.parseDouble(R);
	            double a1=r*MI;
	            double b=(r*MI)+(MI*2400);
	            double c=-2400*am;
	            double D=(b*b)-(4*a1*c);
                double d=Math.sqrt(D);
                double x=(-b+d)/(double)(2*a1);
                double P=(MI*x*(x+1))/2;
	            double i=(P*r)/(12*100);
                        
                System.out.println("Interest="+i);
	         } 
	         
	         else
	         {
	             
	            double am=Double.parseDouble(a);
	            double MI=Double.parseDouble(mi);
	            double r=Double.parseDouble(R);
	            double t=Double.parseDouble(n); 
	            double P=(MI*t*(t+1))/2;
	            double i=(P*r)/(12*100);
	             t=t*12;
	            
	            System.out.println("Interest="+i);
	         }
	        
	        
	        
	    }
	    else if(ch.equalsIgnoreCase("Amount"))
	    {
	         System.out.println("In case you dont know the value enter nil ");
	        System.out.println("please Enter Monthly Installment");
	        String mi=in.readLine();
	        System.out.println("please Enter rate");
	        String R=in.readLine();
	        System.out.println("please Enter time in years");
	        String n=in.readLine();
	        System.out.println("please Enter Interest");
	        String intr=in.readLine();
	        if(intr.equalsIgnoreCase("nil"))
	        {
	        double r=Double.parseDouble(R);
	        double MI=Double.parseDouble(mi);
	        double t=Double.parseDouble(n);
	        t=t*12;
	        
	        double P=(MI*t*(t+1))/2;
	        double i=(P*r)/(12*100);
	        double am=i+(MI*t);
	         System.out.println("Amount="+am);
	       }
	       else if(R.equalsIgnoreCase("nil"))
	        {    
	             double i=Double.parseDouble(intr);
	             double MI=Double.parseDouble(mi);
	             double t=Double.parseDouble(n);
	             t=t*12;
	             double d=t*MI;
	             double am=i+d;
	            
	             System.out.println("Amount="+am);
	        }
	        else if(mi.equalsIgnoreCase("nil"))
	        {
	            double i=Double.parseDouble(intr);
	            double t=Double.parseDouble(n);
	            double r=Double.parseDouble(R);
	            t=t*12;
	              
	          double MI=(i*100*2*12)/((t*(t+1))*r);
	              
	              double a=i+(t*MI);
	             System.out.println("Amount="+a);
	         }
	        else if(n.equalsIgnoreCase("nil"))
	         {
	            double i=Double.parseDouble(intr);
	            double MI=Double.parseDouble(mi);
	            double r=Double.parseDouble(R);
	            double a1=r*MI;
	            double b=r*MI;
	            double c=-2400*i;
	            double D=(b*b)-(4*a1*c);
                double d=Math.sqrt(D);
                double x=(-b+d)/(double)(2*a1);
                double am=(MI*x)+i;
	            System.out.println("Amount="+am);
	         } 
	         
	         else
	         {
	             
	            double i=Double.parseDouble(intr);
	            double MI=Double.parseDouble(mi);
	            double r=Double.parseDouble(R);
	            double t=Double.parseDouble(n); 
	            t=t*12;
	            double a= i+(MI*t);
	             
	            
	            System.out.println("Amount="+a);
	         }
	        
	        
	       
	    }
	    
	    
	    else if(ch.equalsIgnoreCase("rate"))
	    {   System.out.println("In case you dont know the value enter nil ");
	        System.out.println("please Enter Monthly Installment");
	        String mi=in.readLine();
	        System.out.println("please Enter Interest");
	        String intr=in.readLine();
	        System.out.println("please Enter time in years");
	        String n=in.readLine();
	        System.out.println("please Enter amount");
	        String a=in.readLine();
	        if(a.equalsIgnoreCase("nil"))
	        {
	        double i=Double.parseDouble(intr);
	        double MI=Double.parseDouble(mi);
	        double t=Double.parseDouble(n);
	        t=t*12;
	        
	        double P=MI*(t*(t+1))/2;
	        double r=(i*100*12)/P;
	        System.out.println("Rate="+r);
	       }
	        else if(intr.equalsIgnoreCase("nil"))
	        {    
	            double am=Double.parseDouble(a);
	             double MI=Double.parseDouble(mi);
	             double t=Double.parseDouble(n);
	             t=t*12;
	             double d=t*MI;
	             double i=am-d;
	            double P=MI*(t*(t+1))/2;
	           double r=(i*100*12)/P; 
	            System.out.println("Rate="+r);
	        }
	        else if(mi.equalsIgnoreCase("nil"))
	        {
	            double am=Double.parseDouble(a);
	            double t=Double.parseDouble(n);
	            double i=Double.parseDouble(intr);
	            t=t*12;
	            double d=am-i;
	            double MI=d/t;
	            double r=(i*100*2*12)/(MI*t*(t+1));
	             System.out.println("Rate="+r);
	         }
	         else if(n.equalsIgnoreCase("nil"))
	         {
	              double am=Double.parseDouble(a);
	            double MI=Double.parseDouble(mi);
	            double i=Double.parseDouble(intr);
	             
	            double d=am-i;
	            double t=d/MI;
	            double r=(i*100*2*12)/(MI*t*(t+1));
	             System.out.println("Rate="+r);
	         }
	         else
	         {
	             
	            double am=Double.parseDouble(a);
	            double MI=Double.parseDouble(mi);
	            double i=Double.parseDouble(intr);
	            double t=Double.parseDouble(n); 
	            
	             t=t*12;
	            double r=(i*100*2*12)/(MI*t*(t+1));
	             System.out.println("Rate="+r);
	         }
	            
	   }
	    
	    
	    else if(ch.equalsIgnoreCase("Monthly Installment"))
	    {
	        System.out.println("In case you dont know the value enter nil ");
	        System.out.println("please Enter rate");
	        String R=in.readLine();
	        System.out.println("please Enter Interest");
	        String intr=in.readLine();
	        System.out.println("please Enter time in years");
	        String n=in.readLine();
	        System.out.println("please Enter amount");
	        String a=in.readLine();
	        if(a.equalsIgnoreCase("nil"))
	        {
	        double i=Double.parseDouble(intr);
	        double r=Double.parseDouble(R);
	        double t=Double.parseDouble(n);
	        t=t*12;
	         double MI=(i*100*2*12)/((t*(t+1))*r);
	        System.out.println("Monthly Installment"+MI);
	      
	       }
	        else if(intr.equalsIgnoreCase("nil"))
	        {    
	            double am=Double.parseDouble(a);
	             double r=Double.parseDouble(R);
	             double t=Double.parseDouble(n);
	            
	             t=t*12;
	            double MI=(am*2*12*100)/((t*(t+1)*r)+(2*12*100*t));
	            System.out.println("Monthly Installment"+MI);
	        }
	        else if(R.equalsIgnoreCase("nil"))
	        {
	            double am=Double.parseDouble(a);
	            double t=Double.parseDouble(n);
	            double i=Double.parseDouble(intr);
	            t=t*12;
	            double d=am-i;
	            double MI=d/t;
	           
	             System.out.println("Monthly Installment"+MI);
	         }
	         else if(n.equalsIgnoreCase("nil"))
	         {
	              double am=Double.parseDouble(a);
	            double r=Double.parseDouble(R);
	            double i=Double.parseDouble(intr);
	             
	            double d=am-i;
	           
	            double MI=(d*d*r)/((i*100*2*12)-(d*r));
	             System.out.println("Monthly Installment"+MI);
	         }
	         else
	         {
	             
	            double am=Double.parseDouble(a);
	            double r=Double.parseDouble(R);
	            double i=Double.parseDouble(intr);
	            double t=Double.parseDouble(n); 
	            
	             t=t*12;
	            double MI=(i*100*2*12)/(r*t*(t+1));
	             System.out.println("Monthly Installment"+MI);
	          }
	      }
	    
	    else if(ch.equalsIgnoreCase("Time"))
	    {
	        System.out.println("In case you dont know the value enter nil ");
	        System.out.println("please Enter rate");
	        String R=in.readLine();
	        System.out.println("please Enter Interest");
	        String intr=in.readLine();
	        System.out.println("please Enter Monthly Installment");
	        String mi=in.readLine();
	        System.out.println("please Enter amount");
	        String a=in.readLine();
	        if(a.equalsIgnoreCase("nil"))
	        {
	        double i=Double.parseDouble(intr);
	        double r=Double.parseDouble(R);
	        double MI=Double.parseDouble(mi);
	        double x=((i*100*2*12)/(MI*r));
	    double t1=(-1+(Math.sqrt(1+4*x)))/(2);
	    t1=t1/12;
	        
	       System.out.println("time="+t1+"years");
	      
	       }
	       else if(intr.equalsIgnoreCase("nil"))
	           {    
	            
	            // using Sridharacharaya's formula 
	            double am=Double.parseDouble(a);
	            double MI=Double.parseDouble(mi);
	            double r=Double.parseDouble(R);
	            double a1=r*MI;
	            double b=(r*MI)+(MI*2400);
	            double c=-2400*am;
	            double D=(b*b)-(4*a1*c);
                double d=Math.sqrt(D);
                double x=(-b+d)/(double)(2*a1);
	            x=x/12;
	           
	            System.out.println("time="+x+"years");
	        }
	        
	        else if(R.equalsIgnoreCase("nil"))
	        {
	            double am=Double.parseDouble(a);
	            double MI=Double.parseDouble(mi);
	            double i=Double.parseDouble(intr);
	            double d=am-i;
	            double t=d/MI;
	            t=t/12;
	            System.out.println("time="+t+"years");
	         }
	         else if(mi.equalsIgnoreCase("nil"))
	         {
	              double am=Double.parseDouble(a);
	            double r=Double.parseDouble(R);
	            double i=Double.parseDouble(intr);
	            double d=am-i;
	            
	            double t=((i*100*2*12)/(r*d))-1;
	            t=t/12;
	             System.out.println("time="+t+"years");
	         }
	         else
	         {
	             
	            double am=Double.parseDouble(a);
	            double r=Double.parseDouble(R);
	            double i=Double.parseDouble(intr);
	            double MI=Double.parseDouble(mi); 
	            double x=((i*100*2*12)/(MI*r));
	            double t1=(-1-(Math.sqrt(1+4*x)))/(2*-x);
	            t1=t1/12;
	             System.out.println("time="+t1+"years"); 
	         }
	}   
	    
	        else
	         {
	        System.out.println("wrong choice");
	         }
	    
	        
	    
	}
	}
	
	       
	    
	        
	        
	     
	