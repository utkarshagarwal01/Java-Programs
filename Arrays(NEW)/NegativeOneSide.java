/**
 * Print all negative on one side
 */
public class NegativeOneSide
{
public void xys(int a[])
{
int i,j,k=0,x;
int n=a.length;
for(i=0;i<n;i++)
{
if(a[i]<0)
{
x=a[i];
for(j=i;j>k;j--)
{
a[j]=a[j-1];
}
a[k]=x;
k++;
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
}
}