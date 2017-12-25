
/**
 *1,-3,5,-7...n
 */
public class series11
{
public void xyz(int n)
{
int i,c=0;
for(i=1;i<=n;i=i+2)
{
c=c+1;
if(c%2==0)
{
System.out.println(-i);
}
else
{
System.out.println(i);
}
}
}
}