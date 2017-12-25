import java.io.*;
class Months
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for January");
System.out.println("Enter 2 for February");
System.out.println("Enter 3 for March");
System.out.println("Enter 4 for April");
System.out.println("Enter 5 for May");
System.out.println("Enter 6 for June");
System.out.println("Enter 7 for July");
System.out.println("Enter 8 for August");
System.out.println("Enter 9 for September");
System.out.println("Enter 10 for October");
System.out.println("Enter 11for November");
System.out.println("Enter 12 for December");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
switch(ch)
{
case 1:
System.out.println("The month is January");
break;
case 2:
System.out.println("The month is February");
break;
case 3:
System.out.println("The month is March");
break;
case 4:
System.out.println("The month is April");
break;
case 5:
System.out.println("The month is May");
break;
case 6:
System.out.println("The month is June");
break;
case 7:
System.out.println("The month is July");
break;
case 8:
System.out.println("The month is August");
break;
case 9:
System.out.println("The month is September");
break;
case 10:
System.out.println("The month is October");
break;
case 11:
System.out.println("The month is November");
break;
case 12:
System.out.println("The month is December");
break;
default:
System.out.println("Wrong Choice");
}
}
}






