/**
 *1/(1^3)-1/(2^3)+1/(3^3)-1/(4^3)....n
 */
public class sum14
{
public void xyz(int n)
{
double i,s=0;
for(i=1;i<=n;i=i+1)
{
if(i%2==0)
{
s=s-(1/i*i*i);
}
else
{
s=s+(1/i*i*i);
}
}
System.out.println(s);
}
}
