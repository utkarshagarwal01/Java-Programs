import java.util.*;
public class Time
{
int hrs,min;
Time()
{
hrs=0;
min=0;
}
Scanner ob=new Scanner(System.in);
public void input()
{
System.out.println("Enter Hours and Minutes");
hrs=ob.nextInt();
min=ob.nextInt();
}
public void print()
{
System.out.println("Hours="+hrs);
System.out.println("Minutes="+min);
}
Time sum(Time T1, Time T2)
{
Time T3=new Time();
T3.hrs=(T1.hrs+T2.hrs);
T3.min=(T1.min+T2.min);
if(T3.min>=60)
{
T3.min=T3.min-60;
T3.hrs++;
}
return T3;
}
public void main()
{
Time ob1=new Time();
Time ob2=new Time();
Time ob3=new Time();
ob1.input();
ob2.input();
ob3=sum(ob1,ob2);
ob3.print();
}
}
