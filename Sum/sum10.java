/**
 *2-4+6-8....n
 */
public  class sum10
{
public void xyz(int n)
{
int i,s=0;
for(i=2;i<=n;i=i+2)
{
if(i%4==0)
{
s=s-i;
}
else
{
s=s+i;
}
}
System.out.println(s);
}
}