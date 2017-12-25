public class ab
{
public void xyz(int n,double x)
{
double s=0.0;int i;
for(i=1;i<=n;i++)
{
double t= Math.pow(x,i);
s=s+t/i;
}
System.out.println(s);
}
}