public class Fact
{
public void series(int x, int n)
{
double i,m,j=1.0,s=0.0,k=1.0,l=1.0;
for(i=1.0;i<=n;i++)
{
double p=Math.pow(x,j);
for(m=1.0;m<=i*2.0;m++)
{
k=k*l;
l++;
}
double t=p/k;
j=j+2.0;
if(i%2.0==0.0)
{
s=s-t;
}
else
{
s=s+t;
}
}
System.out.println(s);
}
}