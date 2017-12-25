public class Q2
{
int i;
public int prime(int n)
{
int i,c=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==2)
return 1;
else
return 0;
}
public void prime_nos_between_2_nos(int a,int b)
{
int s=0;
for(i=a+1;i<=b-1;i++)
{
if(prime(i)==1)
{
System.out.print(i);
}
}
}
public void sum_of_prime_digits(int n)
{
int s=0;
while(n!=0)
{
int a=n%10;
if(prime(a)==1)
{
s=s+a;
}
n=n/10;
}
System.out.println(s);
}
}
 
