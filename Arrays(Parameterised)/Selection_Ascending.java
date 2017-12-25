public class Selection_Ascending
{
public void xyz(int a[])
{
int t=a.length;
int i,j;
for(i=0;i<(t-1);i++)
{
for(j=i+1;j<t;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<t;i++)
{
System.out.println(a[i]);
}
}
}