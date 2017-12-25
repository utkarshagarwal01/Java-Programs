/**
 * Input a no. and count the factors.
 */
public class factors4
{
public void xyz(int n)
{
int i,c=0;
for(i=1;i<=n;i=i+1)
{
if(n%i==0)
{
c=c+1;
}
}
System.out.println(c);
}
}