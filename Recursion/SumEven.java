public class SumEven
{
int s;
int sum(int n)
{
if(n<2)
return 0;
else
return n+sum(n-2);
}
public void main(int n)
{
if(n%2==0)
s=sum(n);
else
s=sum(n-1);
System.out.print(s);
}
}

