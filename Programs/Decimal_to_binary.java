public class Decimal_to_binary
{
public void xyz(int n)
{
int x=n;
int a,s=0,p=0,i=0;
while(n!=0)
{
a=n%2;
p=(int)Math.pow(10,i);
s=s+(a*p);
i++;
n=n/2;
}
System.out.println(s);
}
}