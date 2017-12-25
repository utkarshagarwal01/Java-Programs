public class prim
{
//to check fo prime numbers
int prime(int n)
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
{
return 1;
}
else
{
return 0;
}}
//to print sum of prime digits
void prime1(int n)
{
int a,s=0;
while(n!=0)
{
a=n%10;
if(prime(a)==1)
{
s+=a;
}
n/=10;
}
System.out.print("sum =" +s);
}
//to print prime factors
void factors(int n)
{
int a,t;
for(a=1;a<=n;a++)
{
if(n%a==0)
{
t=prime(a);
if(t==1)
{
System.out.println(a);
}
}
}
}
//to print all prime numbers between 2 given numbers
void print(int a,int b)
{
int i;
for(i=a+1;i<b;i++)
{
if(prime(i)==1)
{
System.out.println(i);
}
}
}
}