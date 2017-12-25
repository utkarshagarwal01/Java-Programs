public class Q3
{
public void xyz(int n,double x)
{
double s=0.0;int i,p=1;
for(i=1;i<=n;i++) 
{
double t=Math.pow(x,p);
s=s+(t/p);
p=p+2;
}
System.out.println(s);
}
}