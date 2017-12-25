public class digits3
{
public void xyz(int n)
{
int a,ev=0,od=0;
int x=n;
while(n!=0)
{
a=n%10;
if(a%2==0)
{
ev=ev+a;
}
else
{
od=od+a;
}
n=n/10;
}
System.out.println("The sum of even nos. is = "+ev);
System.out.println("The sum of odd nos. is = "+od);
}
}