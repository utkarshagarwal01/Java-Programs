/**
 * Input a no. and multiply the digits.
 */
public class digits2
{
public void xyz(int n)
{
int a,s=1;
int x=n;
while(n!=0)
{
a=n%10;
s=s*a;
n=n/10;
}
System.out.println(s);
}
}
