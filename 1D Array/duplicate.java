class duplicate
{
void main(int a[])
{
int i,j,n=a.length;
int b[]=new int[n];
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
int c;
int k=0;
for(i=0;i<n;i=i+c)
{
c=0;
for(j=0;j<n;j++)
{
if(a[i]==a[j])
{
c++;
}
}
b[k]=a[i];
k++;
}
for(i=0;i<k;i++)
{
System.out.print(a[i]+",");
}
}
