public class Q4
{
public void xyz(int n,double x)
{
double s=1.0;int i,p=1;
for(i=2;p<n;i=i+2)
{
double t=Math.pow(x,i);
s=s+t/i;
p++;
}
System.out.println(s);
}
}