class B_A
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
if(b[i]==a[j])
{
flag=1;
}
}
if(flag==0)
{
c[k]=b[i];
k++;
}
}
for(i=0;i<k;i++)
{
System.out.println(c[i]);
}
}
}
