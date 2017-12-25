 public class Employee_Data
{
protected int empcode;
protected double basicpay;
Employee_Data()
{
empcode=0;
basicpay=0.0;
}
Employee_Data(int c,double b)
{
empcode=c;
basicpay=b;
}
public void printdata()
{
System.out.println("Employee Code->"+empcode);
System.out.println("Basic Pay->"+basicpay);
}
}