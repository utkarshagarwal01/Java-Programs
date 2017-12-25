public class Q4
{
public void xyz(int a[])
{
int i,d=0,f,s=0;
int t=a.length;
for(i=0;i<t;i++)
{
int c=0;
for(f=1;f<=a[i];f++)
{
if(a[i]%f==0)
{
c++;
}
}
if(c==2)
{
s=s+1;
d=d+a[i];
}
}
System.out.println("No. of prime numbers = "+s);
System.out.println("Sum of prime numbers = "+d);
}
}
