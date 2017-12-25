public class Armstrong
{
int armstrong(int n)
{
if(n!=0)
return (int)Math.pow(n%10,3) + armstrong(n/10);
else
return 0;
}
void main (int n)
{
int s=armstrong(n);
if(s==n)
System.out.print("Armstrong");
else
System.out.print("Not Armstrong");
}
}
