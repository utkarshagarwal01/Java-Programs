/**
 *1/2+2/3+3/4+4/5....n
 */
public class sum15
{
public void xyz(int n)
{
double i,s=0;
for(i=1;i<=n;i=i+1)
{
s=s+(i/(i+1));
}
System.out.println(s);
}
}
