class A_B
{
void fgh(int a[],int b[])
{
int t=a.length;
int u=b.length;
int c[]=new int[t];
int i,j,flag,k=0;
for(i=0;i<t;i++)
{
flag=0;
for(j=0;j<u;j++)
{
if(a[i]==b[j])
{
flag=1;
}
}
if(flag==0)
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
