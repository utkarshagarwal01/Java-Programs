import java.io.*;
public class equations
{
	 BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	 void linear()throws IOException
	 {
	     System.out.println("the general form of the equation is ax+b=0");
	     System.out.println("Enter a");
	     int a=Integer.parseInt(in.readLine());
	     System.out.print("Enter b");
	     int b=Integer.parseInt(in.readLine());
	     double x=-b/(double)a;
	    System.out.println(x);
	 }
	 void simultaneous () throws IOException
	 {
	     System.out.println("the general form of the equation is ax+by+c=0, dx+ey+f=0");
	     System.out.println("Enter a");
	     int a=Integer.parseInt(in.readLine());
	     System.out.println("Enter b");
	     int b=Integer.parseInt(in.readLine());
	     System.out.println("Enter c");
	      int c=Integer.parseInt(in.readLine());
	     System.out.println("Enter d");
	     int d=Integer.parseInt(in.readLine());
	     System.out.println("Enter e"); 
	     int e=Integer.parseInt(in.readLine());
	     System.out.println("Enter f");
	     int f=Integer.parseInt(in.readLine());
	     double x;
	     double y;
	    
	        int t=0;
	         for( int i=1; true; i++)
	    {
	        if(i%a==0 && i%d==0)
	        
	        {
	            t=i;
	            break;
	        }
	    }
	    
	        int w=t/a;
	        int u=t/d;
	        a=a*w;
	        b=b*w;
	        c=c*w;
	        d=d*u;
	        e=e*u;
	        f=f*u;
	
	         y=-(c-f)/(double)(b-e);
	         x=(-c-(b*y))/(double)a;
	         System.out.println("x="+x);
	         System.out.println("y="+y);

	     }
}
	     