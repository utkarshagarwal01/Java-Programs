import java.io.*;
class binary_decimal_binary
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for binary to decimal");
System.out.println("Enter 2 for decimal to binary");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
int a,s=0;
switch(ch)
{
case 1:
System.out.println("Enter binary number");
int n=Integer.parseInt(ob.readLine());
int i=0;
while (n!=0)
{
a=n%10;
int t=(int)Math.pow(2,i);
i++;
s=s+(a*t);
n=n/10;
}
System.out.println("The decimal number is "+s);
break;
case 2:
System.out.println("Enter decimal number");
int x=Integer.parseInt(ob.readLine());
int j=0;
while (x!=0)
{
a=x%2;
int t=(int)Math.pow(10,j);
j++;
s=s+(a*t);
x=x/2;
}
System.out.println("The binary number is "+s);
break;
default:
System.out.println("Wrong Choice");
}
}
}