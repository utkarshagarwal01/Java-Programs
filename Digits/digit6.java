public class digit6
{
public void xyz(int n)
{
int a,c,i,s=0;
int x=n;
while(n!=0)
{
a=n%10;
c=0;
for(i=1;i<=a;i++)
{
if(a%i==0)
{
c=c+1;
}
}
if(c==2)
{
s=s+a;
}
n=n/10;
}
System.out.print(s);
}
}
