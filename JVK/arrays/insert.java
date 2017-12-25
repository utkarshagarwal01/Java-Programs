class insert
{
static void gfh(int a[],int m)
{
int i,j,k=0;
int t=a.length;
int c[]=new int[t+1];
for(i=0;i<t;i++)
{
if(a[i]<m)
{
c[k]=a[i];
k++;
}
else
{
c[k]=m;
k++;
for(j=i;j<t;j++)
{
c[k]=a[j];
k++;
}
break;
}
}
for(i=0;i<k;i++)
{
System.out.print(c[i]+",");
}
}
}

