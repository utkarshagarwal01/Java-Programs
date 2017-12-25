public class Q2
{
public void xyz(int n,double x)
{
double s=0.0;int i,p=1,c=1;
for(i=1;p<=n;i++)
{
double t=Math.pow(x,i);
if(c%2==0)
{
s=s-t/i;
}
else
{
s=s+t/i;
}
c++;
p++;
}
System.out.println(s);
}
}