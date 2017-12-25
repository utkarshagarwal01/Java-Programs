class prime
{
void ijkh(int a[])
{
int t=a.length;
int i,j,p=0,c;
for(i=0;i<t;i++)
{
c=0;
for(j=1;j<a[i];j++)
{
if(a[i]%j==0)
{
c++;
}
}
if(c==2)
{
p=p+a[i];
}
}
System.out.println(p);
}
}
