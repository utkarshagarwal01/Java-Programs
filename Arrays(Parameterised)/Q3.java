public class Q3
{
public void xyz(int a[])
{
int i,s=0,max=a[0],min=a[0];
int t=a.length;
for(i=0;i<t;i++)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("Maximum = "+max);
System.out.println("Minimum = "+min);
}
}
