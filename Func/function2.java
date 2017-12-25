
/**
 * Write a program to make a function that returns 1 if a number is prime else returns 0
 * then write a program to print all prime factors between two given numbers
 */

public class function2
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
public void test2(int a,int b)
{
int j;
for(j=a+1;j<b;j++)
{
if(prime(j)==1)
{
System.out.print(j+",");
}
}
}
}
        