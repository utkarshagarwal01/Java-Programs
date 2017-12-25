import java.io.*;
public class coordinate
	{
	     BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	    int x;int y;
	    void distance() throws IOException
	     
	     {
	         double d=0;
	          coordinate obj=new coordinate();
	         System.out.println("For First Point");
	         obj.point();
	         System.out.println("For Second Point");
	         coordinate obj2=new coordinate();
	         obj2.point();
	         int D=((obj.x-obj2.x)*(obj.x-obj2.x))+((obj.y-obj2.y)*(obj.y-obj2.y));
	         d=Math.sqrt(D);
	         System.out.println("The Distance between the point is-----> "+d);
	    
	    }
	    int hcf(int a, int b)
	    { 
	       
	        int j=0;
	        for(int i=1; i<=a; i++)
	        {
	            if(a%i==0 && b%i==0)
	            {
	                j=i;
	            }
	        }
	        return(j);
	    }
	        
	     void point() throws IOException
	     {   System.out.println("enter absicaa");
 	         x=Integer.parseInt(in.readLine());
 	         System.out.println("enter ordinate");
 	         y=Integer.parseInt(in.readLine());
 	     }
 	     
 	     void section() throws IOException
 	     {    
 	         coordinate obje=new coordinate();
 	         coordinate obje2=new coordinate();
 	         coordinate obje3=new coordinate();
 	         System.out.println("If you know the ratio and co-ordinaes of two points and want to know the third point, press 1");
 	         System.out.println("If you know in what ratio a given point divides the line, press 2");
 	         System.out.println("If you want to know if the points are colinear press 3");
 	         System.out.println("Enter choice");
 	          int ch=Integer.parseInt(in.readLine());
 	          if(ch==1)
 	          {
 	          System.out.println("For First Point");
	         obje.point();
	         System.out.println("For Second Point");
	         obje2.point();
	         System.out.println("Enter the ratio m1:m2");
	         System.out.println("Enter m1");
	         
	         int m1=Integer.parseInt(in.readLine());
	         System.out.println("Enter m2");
	         int m2=Integer.parseInt(in.readLine());
	         int x1=((m1*obje2.x)+(m2*obje.x))/(m1+m2);
	         int y1=((m1*obje2.y)+(m2*obje.y))/(m1+m2);
	         System.out.println("The coordinates of the point are-------->("+x1+","+y1+")");
	        }
	        else if(ch==2)
	        {int m1; int m2;
	         System.out.println("The coordinates of end points of line segment");
             System.out.println("For First Point");                           
	         obje.point();
	         System.out.println("For Second Point");
	         obje2.point(); 
	         System.out.println("The point on the line segment");
	         obje3.point();
	         m1=obje.x-obje3.x;
	         m2=obje3.x-obje2.x;
	         if(m1<0 && m2<0)
	         {
	             m1=m1*(-1);
	             m2=m2*(-1);
	         }
	          int i=hcf(m1,m2);
	             m1=m1/i;
	             m2=m2/i;
	      
	         System.out.println("m1:m2--->"+m1+":"+m2);
	        }
	        
	        
	        else if(ch==3)
	        { int m1; int m2; int m3; int m4;
	          System.out.println("For First Point");
	         obje.point();
	         System.out.println("For Second Point");
	         obje3.point();  
	         System.out.println("For Third Point");
	         obje2.point();
	         m1=obje.x-obje3.x;
	         m2=obje3.x-obje2.x;
	         m3=obje.y-obje3.y;
	         m4=obje3.y-obje2.y;
	         if(m1<0 && m2<0)
	         {
	             m1=m1*(-1);
	             m2=m2*(-1);
	         }
	         int q=hcf(m1,m2);
	         m1=m1/q;
	         m2=m2/q;
	         if(m3<0 && m3<0)
	         {
	             m3=m3*(-1);
	             m4=m4*(-1);
	         }
	         
	         int p=hcf(m3,m4);
	         m3=m3/p;
	         m4=m4/p;
	         if(m1==m3 && m2==m4)
	         {
                System.out.println("The points are collinear");
             }
             else
             {
                 System.out.println("The points are not colinear");
             }
             }
             else
             {
                 System.out.println("wrong choice");
 	          }
 	 }
 	 
 	 
 	 void reflection() throws IOException
 	 {
 	     coordinate objec=new coordinate();
 	     objec.point();
 	     System.out.println("where do you wish to reflect:x-axis--->x, y-axis--->y, origin--->o");
 	     String ch=in.readLine();
 	     if(ch.equalsIgnoreCase("x"))
 	     {
 	         System.out.println("Co-ordinates of resulting point--->("+objec.x+","+-objec.y+")");
 	     }
 	     else if(ch.equalsIgnoreCase("y"))
 	     {
 	         System.out.println("Co-ordinates of resulting point--->("+-objec.x+","+objec.y+")");
 	     }
 	     else if(ch.equalsIgnoreCase("o"))
 	     {
 	         System.out.println("Co-ordinates of resulting point--->("+-objec.x+","+-objec.y+")");
 	     }
 	 }
 	}