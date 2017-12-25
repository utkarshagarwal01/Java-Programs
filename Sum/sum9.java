/**
 *1/1+1/2+1/3+1/4....n
 */
public class sum9
{
public void xyz(int n)
{
double s=0.0,i;
for(i=1;i<=n;i=i+1)
{
s=s+(1/i);
}
System.out.println(s);
}
}
