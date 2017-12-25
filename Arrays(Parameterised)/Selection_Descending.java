public class Selection_Descending
{
public void xyz(int a[])
{
int n=a.length;
int i,j;
for(i=0;i<(n-1);i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}