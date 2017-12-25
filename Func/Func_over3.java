public class Func_over3
{
public void compare(int a,int b)
{
if(a>b)
System.out.println("The greater number is="+a);
else
System.out.println("The greater number is="+b);
}
public void compare(char a,char b)
{
if((int)a>(int)b)
System.out.println("The character with greater ASCII code is="+(char)a);
else
System.out.println("The character with greater ASCII code is="+(char)a);
}
public void compare(String s1,String s2)
{
if(s1.length()>s2.length())
System.out.println(s1);
else
System.out.println(s2);
}
}