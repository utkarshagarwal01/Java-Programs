public class digits4
{
public void xyz(int n)
{
int a,s=0;
int x=n;
while(n!=0)
{
a=n%10;
s=s+(a*a*a);
n=n/10;
}
if(s==x)
System.out.println("the number is armstrong");
else
System.out.println("the number is not armstrong");
}
}
