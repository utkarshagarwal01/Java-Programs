public class wI4
{
public void abc (double I)
{
double T;
if (I<=28000)
{
T=0;
System.out.println("Tax"+T);
}
else if(I>28000 && I<=40000)
{
T=I+(2/100*28000);
System.out.println("Tax"+T);
}
else if(I>40000 && I<=60000)
{
T=40+(4/100*40000);
System.out.print("Tax"+T);
}
else if(I>60000 && I<=75000)
{
T=9000+(6/100*60000);
System.out.println("Tax"+T);
}
else
{
T=18000+(8/100*75000);
System.out.println("Tax"+T);
}
}
}
