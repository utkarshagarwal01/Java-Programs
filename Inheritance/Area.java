public class Area extends Perimeter
{
protected double h,area;
Area(double a,double b,double h1)
{
super(a,b);
h=h1;
}
public void doarea()
{
area=b*h;
}
public void show()
{
super.show();
System.out.println("Area="+area);
}
public void main()
{
Area ob=new Area(2.0,3.0,4.0);
ob.doarea();
ob.show();
}
}