/**
 * 2+(2+4)+(2+4+6)+(2+4+6+8)....n
 */
public class sum18
{
public void xyz(int n)
{
int i,s=0,t=0;
for(i=2;i<=n;i=i+2)
{
t=t+i;
s=s+t;
}
System.out.println(s);
}
} 