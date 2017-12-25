public class SumOdd
{
int s;
int sum(int n)
{
if(n<1)
return 0;
else
return n+sum(n-2);
}
public void main(int n)
{
if(n%2==0)
s=sum(n-1);
else
s=sum(n);
System.out.print(s);
}
}

