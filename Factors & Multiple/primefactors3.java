/**
 * Input a no. and print all its prime factors.
 */
public class primefactors3
{
public void xyz(int n)
{
int i=2;
while(n!=1)
{
if(n%i==0)
{
System.out.println(i);
n=n/i;
}
else
{
i=i+1;
}
}
}
}