public class PrimeNumber
{
int prime(int n,int f)
{
if(n==f)
return 1;
if(n%f==0||n==1)
return 0;
else
return prime(n,f+1);
}
void main (int n)
{
int p=prime(n,2);
if(p==1)
System.out.print("Prime");
else
System.out.print("Not Prime");
}}