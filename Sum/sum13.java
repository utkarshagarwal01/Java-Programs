/**
 *1/1-1/2+1/3-1/4....n
 */
public class sum13
{
public void xyz(int n)
{
double i,s=0;
for(i=1;i<=n;i=i+1)
{
if(i%2==0)
{
s=s-(1/i);
}
else
{
s=s+(1/i);
}
}
System.out.println(s);
}
}
