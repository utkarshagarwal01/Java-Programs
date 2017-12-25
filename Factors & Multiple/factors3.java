/**
 * Input a no. and check whether the no is perfect or not.
 */
public class factors3
{
public void xyz(int n)
{
int i,s=0;
for(i=1;i<n;i=i+1)
{
if(n%i==0)
{
s=s+i;
}
}
if(s==n)
System.out.println("perfect");
else
System.out.println("Not perfect");
}
}

