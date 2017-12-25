public class employee
{
int pan=0;
String name="";
double taxincome=0.0,tax=0.0;
/* pan stores pancard number
 */
public void input(int pan,String name,double taxincome)
{
}
public void calc()
{
if(taxincome<=100000)
{
tax=0.0;
}
else if(taxincome>100000&&taxincome<=150000)
{
tax=0.1*(taxincome-100000);
}
else if(taxincome>150000&&taxincome<=250000)
{
tax=5000+0.2*(taxincome-150000);
}
else
{
tax=25000+0.3*(taxincome-250000);
}
}
public void display()
{
System.out.println("Pan number"+'\t'+"name"+'\t'+"tax-income"+'\t'+"tax");
System.out.print(pan+'\t'+name+'\t'+taxincome+'\t'+tax);
}
public void main()
{
employee ob=new employee();
ob.input(pan, name, taxincome);
ob.calc();
ob.display();
}
}