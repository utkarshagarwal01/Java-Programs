class pun
{
void pak(int n)
{
int i,j,s,k;
for(i=1;i<n;i++)
{
s=0;
for(j=i;j<=n;j++)
{
s=s+j;
if(s==n)
{
for(k=i;k<=j;k++)
{
System.out.print(k+"+");
}
System.out.println();
break;
}
}
}
}
}
