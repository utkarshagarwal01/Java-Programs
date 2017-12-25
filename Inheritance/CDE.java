public class CDE extends ABC
{
protected int d;
public void QRP(int d1)
{
XYZ(10,20);
d=d1;
}
public void show()
{
display();
System.out.println("D="+d);
}
public void main()
{
CDE ob=new CDE();
ob.QRP(40);
ob.show();
}
}