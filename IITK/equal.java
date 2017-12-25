class equal
{
static void main()
{
String s="Java";
String s1=new String("Java");
if(s==s1)
System.out.print(1);
if(s.equals(s1))
System.out.print(2);
x();
}
void x()
{System.out.println("Static");}

}