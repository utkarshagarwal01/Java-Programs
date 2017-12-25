public class EG_3
{
public void xyz(int a[])
{
int i,s=0,ev=0,od=0;
int t=a.length;
for(i=0;i<t;i++)
{
if(a[i]%2==0)
{
ev=ev+a[i];
}
else
{
od=od+a[i];
}
}
System.out.println("Sum of even numbers ="+ev);
System.out.println("Sum of odd numbers ="+od);
}
}
