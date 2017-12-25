import java.io.*;
public class Q2
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu");
System.out.println("1: Circle");
System.out.println("2: Square");
System.out.println("3: Rectangle");
System.out.println("4: Area of 4 Walls");
System.out.println("5: Trapezium");
System.out.println("Enter the choice");
int ch= Integer.parseInt(ob.readLine());
double A=0.0;
switch(ch)
{
case 1:
System.out.println("Enter radius");
double r=Double.parseDouble(ob.readLine());
A=(22/7)*r*r;
System.out.println("Area ="+A);
break;
case 2:
System.out.println("Enter side");
double a=Double.parseDouble(ob.readLine());
A=a*a;
System.out.println("Area ="+A);
break;
case 3:
System.out.println("Enter Length and Breadth");
double l=Double.parseDouble(ob.readLine());
double b=Double.parseDouble(ob.readLine());
A=l*b;
System.out.println("Area ="+A);
break;
case 4:
System.out.println("Enter Length, Breadth & Height");
double d=Double.parseDouble(ob.readLine());
double e=Double.parseDouble(ob.readLine());
double f=Double.parseDouble(ob.readLine());
A=((d*e)+(e*f))*2;
System.out.println("Area ="+A);
break;
case 5:
System.out.println("Enter Length, Breadth & Height");
double g=Double.parseDouble(ob.readLine());
double h=Double.parseDouble(ob.readLine());
double z=Double.parseDouble(ob.readLine());
A=0.5*z*(g+h);
System.out.println("Area ="+A);
break;
default:
System.out.println("Wrong character");
}
}
}