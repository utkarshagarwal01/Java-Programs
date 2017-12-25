import java.io.*;
class volume
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for volume of cylinder");
System.out.println("Enter 2 for volume of cone");
System.out.println("Enter 3 for volume of sphere");
System.out.println("Enter 4 for volume of cuboid");
System.out.println("Enter 5 for volume of cube");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
double v=0.0;
switch(ch)
{
case 1:
System.out.println("Enter Radius and height");
double r=Double.parseDouble(ob.readLine());
double h=Double.parseDouble(ob.readLine());
v=(22*r*r*h)/7;
break;
case 2:
System.out.println("Enter Radius and height");
double r1=Double.parseDouble(ob.readLine());
double h1=Double.parseDouble(ob.readLine());
v=(22*r1*r1*h1)/(7*3);
break;
case 3:
System.out.println("Enter radius");
double r2=Double.parseDouble(ob.readLine());
v=(4*22*r2*r2)/(7*3);
break;
case 4:
System.out.println("Enter length,breadth and height");
double l1=Double.parseDouble(ob.readLine());
double b1=Double.parseDouble(ob.readLine());
double h2=Double.parseDouble(ob.readLine());
v=2*(l1+b1)*h2;
break;
case 5:
System.out.println("Enter each side of cube");
double s=Double.parseDouble(ob.readLine());
v=s*s*s;
break;
default:
System.out.println("Wrong Choice");
}
System.out.println("The volume is "+v);
}
}
