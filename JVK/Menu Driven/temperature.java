import java.io.*;
class temperature
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for Farenheit to Celcius");
System.out.println("Enter 2 for Celcius to Farenheit");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
switch(ch)
{
case 1:
System.out.println("Enter temperature in Celcius");
double C=Double.parseDouble(ob.readLine());
double F=((9*C)/5)+32;
System.out.println("The temperature in farenhiet is "+F);
break;
case 2:
System.out.println("Enter temperature in Farenheit");
double F1=Double.parseDouble(ob.readLine());
double C1=(5*(F1-32))/9;
System.out.println("The temperature in celcius is "+C1);
break;
default:
System.out.println("Wrong Choice");
}
}
}
