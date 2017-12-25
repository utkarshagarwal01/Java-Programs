class selection_sort2
{
static void xyz(int a[])
{
int i,j,temp=0,pos=0,small;
int n=a.length;
for(i=0;i<n;i++)
{
small=a[i];
pos=i;
for(j=i+1;j<n;j++)
{
if(a[j]<small)
{
small=a[j];
pos=j;
}
}
temp=a[i];
a[i]=a[pos];
a[pos]=temp;
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}