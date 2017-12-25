/**
 * 1+(1+2)+(1+2+3)+(1+2+3+4)....n
 */
public class sum17
{
public void xyz(int n)
{
int i,s=0,t=0;
for(i=1;i<=n;i=i+1)
{
t=t+i;
s=s+t;
}
System.out.println(s);
}
} 