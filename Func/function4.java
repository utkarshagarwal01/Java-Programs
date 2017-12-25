/**
 * Write a program to make a function that returns 1 if a number is prime else returns 0
 * then write a program to print possible prime combinations to sum up a number
 */
public class function4
{
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
{
return 1;
}
else
{
return 0;
}
}
public void test3(int n)
{
int j;
for(j=3;j<=n/2;j++)
{
if(prime(j)==1 && prime(n-j)==1)
{
System.out.println(j+"+"+(n-j));
}
}
}
}
 
