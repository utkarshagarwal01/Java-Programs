class array000002345
{
void ffr(int a[])
{
int t=a.length;
int i,k=0;
int c[]=new int [t];
for(i=0;i<t;i++)
{
if(a[i]==0)
{
c[k]=a[i];
k++;
}
}
for(i=0;i<t;i++)
{
if(a[i]!=0)
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