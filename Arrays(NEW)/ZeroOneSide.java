/**
 * Print all zero on one side
 */
public class ZeroOneSide
{
public void xys(int a[])
{
int i,j;
int n=a.length;
for(i=0;i<n;i++)
{
if(a[i]==0)
{
for(j=i;j>0;j--)
{
a[j]=a[j-1];
}
a[0]=0;
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
}
}