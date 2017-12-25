class q31
{
void myfunc()
{
int ar[]={16,14,5,12,3,0,1};
for(int x=0;x<5;x++)
{
for(int y=0;y<6-x;y++)
{
if(ar[y]>ar[y+1])
{
int t=ar[y];
ar[y]=ar[y+1];
ar[y+1]=t;
}
}
}
for(int i=0;i<7;i++)
System.out.print(ar[i]);
}
}