public class frequency
{
String s1="",w;
int t,c;
public void frequency(String str,int i)
{
t=str.length();
if(i<t)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.equalsIgnoreCase(w))
{
c++;
}
s1="";
}
frequency(str,++i);
}
else
{
System.out.println("frequency of the inputted word="+c);
}
}
public void main(String str,String w1)
{
str=str+" ";
t=str.length();
c=0;
w=w1;
frequency(str,0);
}
}
