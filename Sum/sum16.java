/**
 *1/2+3/4+5/6+7/8....n
 */
public class sum16
{
public void xyz(int n)
{
double i,s=0;
for(i=1;i<=n;i=i+2)
{
s=s+(i/(i+1));
}
System.out.println(s);
}
}
