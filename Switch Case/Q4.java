import java.io.*;
public class Q4
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu");
System.out.println("1: Celsius to Farenhiet");
System.out.println("2: Farenhiet to Celcius");
System.out.println("Enter the choice");
int ch= Integer.parseInt(ob.readLine());
double T=0.0;
switch(ch)
{
case 1:
System.out.println("Enter Temperature in Celcius");
double c=Double.parseDouble(ob.readLine());
T=((9*c)/5)+32;
System.out.println("Temperature in Farenhiet = "+T);
break;
case 2:
System.out.println("Enter Temparature in Farenhiet");
double f=Double.parseDouble(ob.readLine());
T=(5*(f-32))/9;
System.out.println("Temperature in Celcius = "+T);
break;
default:
System.out.println("Wrong character");
}
}
}