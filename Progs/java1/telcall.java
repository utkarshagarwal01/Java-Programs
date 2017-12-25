public class telcall
{
int n;float amt;
telcall(int x)
{
n=x;
}
public void compute()
{
if(n>=1&&n<=100)
{
amt=500;
}
else if(n>100&&n<=200)
{
amt=500+n-100;
}
else
{}
}
void display()
{
System.out.println("calls"+'\t'+"amt");
System.out.print(n+'\t'+amt);
}
public void main()
{
telcall ob1=new telcall(n);
ob1.compute();
ob1.display();
}
}