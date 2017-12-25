public class traversall
{
public void traversal(int a[])
{ 
int i;int n=a.length;
int mid=0;
if(n%2==0)
mid=n/2;
else
mid=(n+1)/2;
for(i=0;i<n/2;i++)
{
int t=a[i];
a[i]=a[mid+i];
a[mid+i]=t;
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+ " ");
}
}
}