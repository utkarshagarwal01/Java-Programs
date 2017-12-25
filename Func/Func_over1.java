public class Func_over1
{ 
double vol;
public void vol(int h,int r)
{
vol=(22/7)*r*r*h;
System.out.println("The volume of cylinder is ="+vol);
}
public void vol(int h,double r)
{
vol=(1/3)*(22/7)*r*r*h;
System.out.println("The vol of cone is="+vol);
}
public void vol(double r)
{
vol=(4/3)*(22/7)*r*r*r;
System.out.println("The vol of sphere is="+vol);
}
public void vol(int l,int b,int h)
{
vol=l*b*h;
System.out.println("The vol of cuboid is+"+vol);
System.out.println(vol); 
}
public void vol(int a)
{
vol=a*a*a;
System.out.println("The vol of cube is="+vol);
System.out.println(vol); 
}
}
