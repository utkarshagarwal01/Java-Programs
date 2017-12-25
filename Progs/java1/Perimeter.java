public class Perimeter
{
protected double a,b;
Perimeter(double a1, double b1)
{
a=a1;
b=b1;
}
double calculate()
{
double P;
P=2*(a+b);
return P;
}
public void show()
{
System.out.println("Length="+a);
System.out.println("Breadth="+b);
System.out.println("Perimeter="+calculate());
}
}