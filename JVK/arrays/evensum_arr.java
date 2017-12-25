class evensum_arr
{
void ijkh(int a[])
{
int t=a.length;
int i,even=0,odd=0;
for(i=1;i<t;i++)
{
if(a[i]%2==0)
even=even+a[i];
else
odd=odd+a[i];
}
System.out.println(even);
System.out.println(odd);
}
}