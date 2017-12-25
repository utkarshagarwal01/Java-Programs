import java.util.*;
public class Angle
{
int deg,min;
Angle()
{
deg=0;
min=0;
}
Scanner ob=new Scanner(System.in);
public void input()
{
System.out.println("Enter degrees and minutes");
deg=ob.nextInt();
min=ob.nextInt();
}
public void display()
{
System.out.println("Degrees="+deg);
System.out.println("Minutes="+min);
}
Angle sum(Angle T1, Angle T2)
{
Angle T3=new Angle();
T3.deg=(T1.deg+T2.deg);
T3.min=(T1.min+T2.min);
if(T3.min>=60)
{
T3.min=T3.min-60;
T3.deg++;
}
return T3;
}
public void main()
{
Angle ob1=new Angle();
Angle ob2=new Angle();
Angle ob3=new Angle();
ob1.input();
ob2.input();
ob3=sum(ob1,ob2);
ob3.display();
}
}
