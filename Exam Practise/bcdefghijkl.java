public class bcdefghijkl
{
public void xyz(int n)
{
int x=n;
int i,a,s=0,f;
while(n!=0)
{
a=n%10;
f=1;
for(i=1;i<=a;i++)
{
f=f*i;
}
s=s+f;
n=n/10;
}
if(s==x)
{
System.out.print("Magic");
}
else
{
System.out.print("Not a Magic");
}
}
}