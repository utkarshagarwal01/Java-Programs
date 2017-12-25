public class Q12
{
public void xyz(int a[])
{
int i;
int t=a.length;
int j,c;
for(i=0;i<t;i=i+c)
{
c=0;
for(j=i;j<t;j++)
{
if(a[i]==a[j])
{
c++;
}
}
System.out.println("Frequency of "+a[i]+" is "+c+".");
}
}
}