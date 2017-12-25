import java.io.*;
public class lucky
{
void main(int a[])
{
int n=a.length;
int mid=0,i;
if(n%2==0)
{
mid=(n/2)-1;
}
else
{
mid=(n-1)/2;
}
a[mid]=a[0];
int b[]=new int[n];
for(i=1;i<n;i++)
{
b[i]=a[i];

}
int k=0;
for(i=1;i<=mid;i++)
{
a[mid+i]=b[k];
a[mid-i]=b[k+1];
k+=2;
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+",");
}
}
}
