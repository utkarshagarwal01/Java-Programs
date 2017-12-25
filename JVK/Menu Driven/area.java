import java.io.*;
class area
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for area of circle");
System.out.println("Enter 2 for area of square");
System.out.println("Enter 3 for area of rectangle");
System.out.println("Enter 4 for area of four walls");
System.out.println("Enter 5 for area of trapezium");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
double a=0.0;
switch(ch)
{
case 1:
System.out.println("Enter Radius");
double r=Double.parseDouble(ob.readLine());
a=(22*r*r)/7;
break;
case 2:
System.out.println("Enter each side");
double s=Double.parseDouble(ob.readLine());
a=s*s;
break;
case 3:
System.out.println("Enter length and breadth");
double l=Double.parseDouble(ob.readLine());
double b=Double.parseDouble(ob.readLine());
a=l*b;
break;
case 4:
System.out.println("Enter length,breadth and height");
double l1=Double.parseDouble(ob.readLine());
double b1=Double.parseDouble(ob.readLine());
double h1=Double.parseDouble(ob.readLine());
a=2*(l1+b1)*h1;
break;
case 5:
System.out.println("Enter length of parallel sides and height");
double p1=Double.parseDouble(ob.readLine());
double p2=Double.parseDouble(ob.readLine());
double h2=Double.parseDouble(ob.readLine());
a=0.5*(p1+p2)*h2;
break;
default:
System.out.println("Wrong Choice");
}
System.out.println("The area is"+a);
}
}
