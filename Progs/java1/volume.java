public class volume
{
double volume;
public void n(int l,int b,int h)
{
volume=l*b*h;
System.out.println(volume);
}
public void n(double r,double h)
{
volume=(22/7)*r*r*h;
System.out.println(volume);
}
public void n(int s)
{
volume=s*s*s;
System.out.println(volume);
}
public void n(int r,double h)
{
volume=(1/3)*(22/7)*r*r*h;
System.out.println(volume);
}
public void n(double r)
{
volume=(4/3)*(22/7)*r*r*r;
System.out.println(volume);
}
}