import java.io.*;
public class area
{
   BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	void rect() throws IOException
	{
	    System.out.println("Enter length");
	    double l=Double.parseDouble(in.readLine());
	    System.out.println("Enter breadth");
	    double b=Double.parseDouble(in.readLine());
	    double ar=l*b;
	    System.out.println("area="+ar);
	}
	void square() throws IOException
	{
	    System.out.println("Enter Side");
	    double s=Double.parseDouble(in.readLine());
	    double ar=s*s;
	    System.out.println("area="+ar);
	}
	void circle()throws IOException
	{
	    System.out.println("Enter radius");
	    double r=Double.parseDouble(in.readLine());
	    double ar=(22/7)*r*r;
	    System.out.println("area="+ar);
	}
	void trapezium()throws IOException
	{
	    System.out.println("Enter heigth");
	    double h=Double.parseDouble(in.readLine());
	    System.out.println("Enter length of 1st parallel side");
	    double a=Double.parseDouble(in.readLine());
	    System.out.println("Enter length of 2nd parallel side");
	    double b=Double.parseDouble(in.readLine());
	    double ar=(1/2)*(a+b)*h;
	    System.out.println("area="+ar);
	}
	void triangles()throws IOException
	{
	    System.out.println("Type side if u want to enter sides");
	    System.out.println("Type heigth if u want to enter heigth and base");
	    String ch=in.readLine();
	    if(ch.equalsIgnoreCase("side"))
	    {   double ar;
	        System.out.println("Enter 1st side");
	        double a=Double.parseDouble(in.readLine());
	        System.out.println("Enter 2nd side");
	        double b=Double.parseDouble(in.readLine());
	        System.out.println("Enter 3rd side");
	        double c=Double.parseDouble(in.readLine());
	        double s=(a+b+c)/2;
	        double h=s*(s-a)*(s-b)*(s-c);
	        ar=Math.sqrt(h);
	         System.out.println("area="+ar);
	     }
	     else if(ch.equalsIgnoreCase("heigth"))
	     {
	           System.out.println("Enter base");
	        double b=Double.parseDouble(in.readLine());
	        System.out.println("Enter heigth");
	        double h=Double.parseDouble(in.readLine());
	        double ar=(1/2)*b*h;
	        System.out.println("area ="+ar);
	        
	    }
	}
	}
	    
	        
	