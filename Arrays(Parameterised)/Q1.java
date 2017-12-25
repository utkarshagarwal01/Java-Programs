public class Q1
{
public void xyz(int a[])
{
int i,s=0,n=0,p=0;
int t=a.length;
for(i=0;i<t;i++)
{
if(a[i]>0)
{
p=p+a[i];
}
else
{
n=n+a[i];
}
}
System.out.println("Sum of positive numbers ="+p);
System.out.println("Sum of negative numbers ="+n);
}
}
