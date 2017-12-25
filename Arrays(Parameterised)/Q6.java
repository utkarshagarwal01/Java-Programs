public class Q6
{
public void xyz(int a[],int n)
{
int i,c=0,t=a.length;
for(i=0;i<t;i++)
{
if(n==a[i])
{
c++;
}
}
System.out.print("Frequncy of inputted element = "+c);
}
}