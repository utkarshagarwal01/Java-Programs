import java.io.*;
public class Q1
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu");
System.out.println("1: Add");
System.out.println("2: Subtract");
System.out.println("3: Multiply");
System.out.println("4: Divide");
System.out.println("5: Modulus");
System.out.println("Enter the choice");
int ch= Integer.parseInt(ob.readLine());
System.out.println("Enter the numbers");
int a= Integer.parseInt(ob.readLine());
int b= Integer.parseInt(ob.readLine());
int s=0;
switch(ch)
{
case 1:
s=a+b;
System.out.println(s);
break;
case 2:
s=a-b;
System.out.println(s);
break;
case 3:
s=a*b;
System.out.println(s);
break;
case 4:
double d=a/(double)b;
System.out.println(d);
break;
case 5:
s=a%b;
System.out.println(s);
break;
default:
System.out.println("Wrong character");
}
}
}