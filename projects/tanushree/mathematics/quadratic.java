 import java.io.*;
 class quadratic
{
  void quad()throws IOException
 {    BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
      System.out.println("The general form of equation is ax"+(char)170+"+ bx+c");
      System.out.println("enter a");
      int a=Integer.parseInt(in.readLine());
	  System.out.println("enter b");
      int b=Integer.parseInt(in.readLine());
	  System.out.println("enter c");
	  int c=Integer.parseInt(in.readLine());
     double D;double x1=0; double x=0;double d; int ch=170;
     if(a==0)
     {
         System.out.println("Quadratic equations not possible");
     }
     else
     {
        D=(b*b)-(4*a*c);
        if(D>0)
        {   d=Math.sqrt(D);
            x=(-b+d)/(double)(2*a);
            x1=(-b-d)/(double)(2*a);
            System.out.println(x1+" "+x+" "+"roots are real and unequal");
            
        }
       else if(D<0)
        {
            System.out.println("roots are imaginary");
        }
        else
          
          {
              
              x=-b/(double)(2*a);
              System.out.println(x+" "+"roots are real and equal");
              
          }
      }}
  }
         
         