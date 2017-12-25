public class Q1
{
public void xyz(int n,double x)
{
int i;double s=0,p=1;
for(i=1;i<=n;i++)
{
double t=Math.pow(x,i);
s=s+t/i;
p++;
}
System.out.println(s);
}
}