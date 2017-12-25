public class Bubble_Descending
{
public void xyz(int a[])
{
int n=a.length;
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<(n-i-1);j++)
{
if(a[j]<a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}