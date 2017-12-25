/**
 *-1+2-3+4....n
 */
public  class sum7
{
public void xyz(int n)
{
int i,s=0;
for(i=1;i<=n;i=i+1)
{
if(i%2==0)
{
s=s+i;
}
else
{
s=s-i;
}
}
System.out.println(s);
}
}