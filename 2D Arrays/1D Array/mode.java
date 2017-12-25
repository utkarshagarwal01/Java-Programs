class mode
{
void main(int a[])
{
int f=0,max=0,mode=0;
int i,j,n=a.length;
for(i=0;i<n;i++)
{
f=0;
for(j=0;j<n;j++)
{
if(a[i]==a[j])
{
f++;
}
}
if((f-1)>max)
{
max=f;
mode=a[i];
}
}
System.out.print(mode);
}
}