public class Overtime extends Employee_Data
{
protected int ndays;
protected double rate;
Overtime(int empcode, double basicpay, int n, double r)
{
super(empcode,basicpay);
ndays=n;
rate=r;
}
double calculate_sal()
{
double ts;
ts=(ndays*rate)+basicpay;
return ts;
}
void show_val()
{
printdata();
System.out.println("Number Of Days->"+ndays);
System.out.println("Rate->"+rate);
double totalsal=calculate_sal();
System.out.println("Total Slaray="+totalsal);
}
public void main()
{
Overtime ob=new Overtime(1001,40000.00,30,50.00);
ob.show_val();
}
}