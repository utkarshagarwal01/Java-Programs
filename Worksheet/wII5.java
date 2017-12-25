public class wII5
{
public void equation(int a, int b, int c)
{
double d=b*b-4*a*c;
if(d>0)
{
double t=Math.sqrt(d);
double x1=(-b-t)/(2*a);
double x2=(-b+t)/(2*a);
System.out.println("roots are unequal and real"+x1+x2);
}
else if(d==0)
{
double x1=-b/(2*a);
double x2=-b/(2*a);
System.out.println("roots are real and equal"+x1+x2);
}
else
{
System.out.print("roots are imaginary");
}
}
}
 
