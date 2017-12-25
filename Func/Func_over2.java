public class Func_over2
{ 
double area;
public void area(double r)
{
area=(22/7)*r*r;
System.out.println("The area of circle is="+area);
}
public void area(int a)
{
area=a*a;
System.out.println("The area of square is="+area);
}
public void area(int l,int b)
{
area=l*b;
System.out.println("The area of rectangle is="+area);
}
public void area(int a,int b,double h)
{
area=2*((a*h)+(b*h));
System.out.println("The area of four walls is="+area);
}
public void area(int a,int b,int h)
{
area=(1/2)*(a+b)*h;
System.out.println("The area of trapezium is="+area);
}
}