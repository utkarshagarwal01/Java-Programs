public class BinarySearch
{
public void xyz(int a[],int ele)
{
int n=a.length;
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<(n-1-i);j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
int beg=0;int last=n-1;int flag=0;
while(beg<last)
{
int mid=(beg+last)/2;
if(a[mid]==ele)
{
flag=1;
break;
}
else if(a[mid]>ele)
last=mid-1;
else
beg=mid+1;
}
if(flag==1)
{
System.out.print("element found");
}
else
System.out.print("Not found");
}
}

