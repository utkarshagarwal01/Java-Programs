import java.io.*;
public class Q5
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu");
System.out.println("1: Decimal to Binary");
System.out.println("2: Binary to Decimal");
System.out.println("Enter the choice");
int ch= Integer.parseInt(ob.readLine());
int T=0;
switch(ch)
{
case 1:
System.out.println("Enter No. in Decimal");
int n=Integer.parseInt(ob.readLine());
int x=n;
int a,s=0,p=0,i=0;
while(n!=0)
{
a=n%2;
p=(int)Math.pow(10,i);
s=s+(a*p);
i++;
n=n/2;
}
System.out.println(s);
break;
case 2:
System.out.println("Enter No. in binary");
int e=Integer.parseInt(ob.readLine());
int f=e;
int b,c=0,d=0,h=0;
while(e!=0)
{
b=e%10;
d=(int)Math.pow(2,h);
c=c+(b*d);
h++;
e=e/10;
}
System.out.println(c);
break;
default:
System.out.println("Wrong character");
}
}
}