public class EFG extends BCD
{
protected int f;
public void PSR(int f1)
{
PQR(30);
f=f1;
}
public void prints()
{
print();
System.out.println("F="+f);
}
public void main()
{
EFG ob=new EFG();
ob.PSR(60);
ob.prints();
}
}