/**
 * Input a no. and print its prime factors.
 */
public class primefactors
{
public void xyz(int n)
{
int i=1,c=0,j;
for(i=1;i<=n;i=i+1)
{
if(n%i==0)
{
c=0;
for(j=1;j<=i;j=j+1)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
System.out.println(i);
}
}
}
}
}