import java.io.*;
class primespecial
{
public int prime(int n)
{
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c>2)
{
return 0;
}
else
{
return 1;
}
}
public int factorial(int n)
{
int s=0,f=1;
while(n!=0)
{
int a=n%10;
for(int i=1;i<=a;i++)
{
f=f*i;
}
s=s+f;
n=n/10;
f=1;
}
return s;
}
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input two numbers");
int n1=Integer.parseInt(ob.readLine());
int n2=Integer.parseInt(ob.readLine());
int i;
for(i=n1+1;i<n2;i++)
{
if(prime(i)==1 && factorial(i)==i)
{
System.out.println(i);
}
}
}
}