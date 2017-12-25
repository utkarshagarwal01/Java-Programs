public class DEF extends BCD
{
protected int e;
public void RPS(int e1)
{
PQR(30);
e=e1;
}
public void shows()
{
print();
System.out.println("E="+e);
}
public void main()
{
DEF ob=new DEF();
ob.RPS(50);
ob.shows();
}
}