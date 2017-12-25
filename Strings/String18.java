public class String18
{
public void yz(int a[])
{
int t=a.length;
int i;
for(i=0;i<t;i=i+2)
{
int swap=a[i];
a[i]=a[i+1];
a[i+1]=swap;
}
for(i=0;i<t;i++)
{
System.out.println(a[i]);
}
}
}