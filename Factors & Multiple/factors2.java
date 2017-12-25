/**
 * Input a no. and sum the factors
 */
public class factors2
{
public void xyz(int n)
{
int i,s=0;
for(i=1;i<=n;i=i+1)
{
if(n%i==0)
{
s=s+i;
}
}
System.out.println(s);
}
}

