import java.io.*;
public class Q3
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu");
System.out.println("1: Cylinder");
System.out.println("2: Cone");
System.out.println("3: Sphere");
System.out.println("4: Cube");
System.out.println("5: Cuboid");
System.out.println("Enter the choice");
int ch= Integer.parseInt(ob.readLine());
double V=0.0;
switch(ch)
{
case 1:
System.out.println("Enter Radius");
System.out.println("Enter Height");
double r=Double.parseDouble(ob.readLine());
double h=Double.parseDouble(ob.readLine());
V=(22/7)*r*r*h;
System.out.println("Volume ="+V);
break;
case 2:
System.out.println("Enter Radius");
System.out.println("Enter Height");
double q=Double.parseDouble(ob.readLine());
double w=Double.parseDouble(ob.readLine());
V=(1/3)*(22/7)*q*q*w;
System.out.println("Volume ="+V);
break;
case 3:
System.out.println("Enter Radius");
double e=Double.parseDouble(ob.readLine());
V=(4/3)*(22/7)*e*e*e;
System.out.println("Volume ="+V);
break;
case 4:
System.out.println("Enter Side");
double s=Double.parseDouble(ob.readLine());
V=s*s*s;
System.out.println("Volume ="+V);
break;
case 5:
System.out.println("Enter Length, Breadth & Height");
double l=Double.parseDouble(ob.readLine());
double b=Double.parseDouble(ob.readLine());
double x=Double.parseDouble(ob.readLine());
V=l*b*x;
System.out.println("Volume ="+V);
break;
default:
System.out.println("Wrong character");
}
}
}