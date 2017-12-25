public class ac
{
public void xyz(int n)
{
int s;int a,x=n;
while(n>9)
{
s=0;
while(n!=0)
{
a=n%10;
s=s+a;
n=n/10;
}
n=s;
}
System.out.println(n);
}
}