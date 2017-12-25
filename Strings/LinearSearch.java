public class LinearSearch
{
public void xyz(int a[],int ele)
{
int n=a.length;
int i,j,flag=0;
for(i=0;i<n;i++)
{
if(a[i]==ele)
{
flag=1;
break;
}
}
if(flag==1)
System.out.print("element found"+i);
else
System.out.print("not found");
}
}  