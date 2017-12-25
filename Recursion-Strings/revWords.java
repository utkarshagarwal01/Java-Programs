public class revWords
{
String s1="",s2="";
int t;
public void revsentence(String str,int i)
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
s2=s1+s2;
s2=" "+s2;
s1="";
}
revsentence(str,++i);
}
else
{
System.out.println(s2);
}
}
public void main(String str)
{
str=str+" ";
t=str.length();
revsentence(str,0);
}
}
