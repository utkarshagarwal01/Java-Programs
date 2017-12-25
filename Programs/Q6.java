public class Q6
{
public void xyz(int n,double x)
{
double s=1.0;int i,p=1,c=2;
for(i=2;p<n;i=i+2)
{
double t=Math.pow(x,i);
if(c%4==0)
{
s=s+t/i;
}
else
{
s=s-t/i;
}
c=c+2;
p++;
}
System.out.println(s);
}
}