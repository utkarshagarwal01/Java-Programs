public class Q2
{
public void xyz(int a[])
{
int i,s=0,n=0,p=0,z=0;
int t=a.length;
for(i=0;i<t;i++)
{
if(a[i]>0)
{
p=p+1;
}
else if (a[i]<0)
{
n=n+1;
}
else
{
z=z+1;
}
}
System.out.println("Number of positive numbers ="+p);
System.out.println("Number of negative numbers ="+n);
System.out.println("Number of Zero's ="+z);
}
}