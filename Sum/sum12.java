/**
 *1/(1^2)+1/(2^2)+1/(3^2)+1/(4^2)....n
 */
public class sum12
{
public void xyz(int n)
{
double i,s=0;
for(i=1;i<=n;i=i+1)
{
s=s+(1/i*i);
}
System.out.println(s);
}
}
