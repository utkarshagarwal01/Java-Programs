public class Q11
{
public void xyz(int a[])
{
int i;
double x,m=0,s=0;
int t=a.length;
for(i=0;i<t;i++)
{
s=s+a[i];
}
x=s/t;
System.out.println("Mean = "+x);
if(t%2==0)
{
m=(a[t/2]+a[t/2-1])/(double)2;
}
else
{
m=a[(t-1)]/2;
}
System.out.println("Median = "+m);
int j,c,max=0,mode=0;
for(i=0;i<t;i++)
{
c=0;
for(j=0;j<t;j++)
{
if(a[i]==a[j])
{
c++;
}
}
if(c>max)
{
max=c;
mode=a[i];
}
}
System.out.println("Mode ="+mode);
}
}