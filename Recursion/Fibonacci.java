public class Fibonacci
{
int fib(int n)
{
if(n==1)
return 0;
else
if(n==2)
return 1;
else
return fib(n-1)+fib(n-2);
}
void main(int n)
{
for(int i=1;i<=n;i++)
{
int t=fib(i);
System.out.print(t);
}
}
}
