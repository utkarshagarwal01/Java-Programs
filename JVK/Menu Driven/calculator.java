import java.io.*;
class calculator
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for addition");
System.out.println("Enter 2 for subtraction");
System.out.println("Enter 3 for multiplication");
System.out.println("Enter 4 for division");
System.out.println("Enter 5 for modulus");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
System.out.println("Enter two numbers");
int a=Integer.parseInt(ob.readLine());
int b=Integer.parseInt(ob.readLine());
double s=0.0;
switch(ch)
{
case 1:
s=a+b;
break;
case 2:
s=a-b;
break;
case 3:
s=a*b;
break;
case 4:
s=a/b;
break;
case 5:
s=a%b;
break;
default:
System.out.println("Wrong Choice");
}
System.out.println(s);
}
}
