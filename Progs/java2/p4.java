public class p4
{
public void xyz(int n)
{
int sum = 0;
while (n > 0) 
{ 
   int a = n % 10; 
   sum = sum + a; 
   n = n / 10; 
   if(n==0 && sum>9)
    {
	n=sum;
	sum=0;
    }
}
System.out.print(sum);
}
}