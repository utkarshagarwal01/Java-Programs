public class abc
{
public void xyz(int n)
{
int x=n,b,a;
int c=0;String s1="";
while(n!=0)
{
c=0;
a=n%10;
if(n>10)
{
while(x!=0)
{
b=x%10;
if(a==b)
c++;
x=x/10;
}
if(c>1)
s1=0+s1;
else
s1=a+s1;
n=n/10;
if(n<10)
s1=n+s1;
}}
System.out.print(s1);
}}
