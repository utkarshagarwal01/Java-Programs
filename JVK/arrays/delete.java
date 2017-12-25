class delete
{
void ffr(int a[],int m)
{
int t=a.length;
int i,k=0;
int c[]=new int [t];
for(i=0;i<t;i++)
{
if(a[i]!=m)
{
c[k]=a[i];
k++;
}
}
for(i=0;i<k;i++)
{
System.out.println(c[i]);
}
}
}