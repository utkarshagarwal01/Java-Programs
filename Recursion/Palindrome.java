class Palindrome
{
int x;
int palin(int n,int i)
{
if(n!=0)
{
return palin(n/10,i*10+n%10);
}
else
{
return i;
}
}
public void main(int n)
{
x=n;
int t=palin(n,0);
if(x==t)
{
System.out.println("Palindrome");   
}
else
{
System.out.println("Not Palindrome");
}
}}