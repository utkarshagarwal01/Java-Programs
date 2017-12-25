public class Q5
{
public void xyz(int a[])
{
int i,f,s=0,j=0;
int t=a.length;
for(i=0;i<t;i++)
{
s=0;
for(f=1;f<a[i];f++)
{
if(a[i]%f==0)
{
s=s+f;
}
}
if(s==a[i])
{
j=j+a[i];
}
}
System.out.println("Sum of perfect numbers = "+j);
}
}
