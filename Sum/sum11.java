/**
 *1-3+5-7....n
 */
public  class sum11
{
public void xyz(int n)
{
int i,s=0,c=1;
for(i=1;i<=n;i=i+2)
{
if(c%2==0)
{
s=s-i;
}
else
{
s=s+i;
}
c=c+1;
}
System.out.println(s);
}
}