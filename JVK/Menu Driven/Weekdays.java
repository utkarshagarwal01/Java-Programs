import java.io.*;
class Weekdays
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1 for Sunday");
System.out.println("Enter 2 for Monday");
System.out.println("Enter 3 for Tuesday");
System.out.println("Enter 4 for Wednesday");
System.out.println("Enter 5 for Thursday");
System.out.println("Enter 6 for Friday");
System.out.println("Enter 7 for Saturday");
System.out.println("Enter choice");
int ch=Integer.parseInt(ob.readLine());
switch(ch)
{
case 1:
System.out.println("The day is Sunday");
break;
case 2:
System.out.println("The day is Monday");
break;
case 3:
System.out.println("The day is Tuesday");
break;
case 4:
System.out.println("The day is Wednesday");
break;
case 5:
System.out.println("The day is Thursday");
break;
case 6:
System.out.println("The day is Friday");
break;
case 7:
System.out.println("The day is Saturday");
break;
default:
System.out.println("Wrong Choice");
}
}
}






