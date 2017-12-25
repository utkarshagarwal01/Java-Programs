/**
 * 1+(1+3)+(1+3+5)+(1+3+5+7)....n
 */
public class sum19
{
public void xyz(int n)
{
int i,s=0,t=0;
for(i=1;i<=n;i=i+2)
{
t=t+i;
s=s+t;
}
System.out.println(s);
}
} 