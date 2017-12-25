public class longestword
{
String s1="",l="";
int t,max;
public void l(String str,int i)
{
int t=str.length();
if(i<t)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.length()>max)
{
max=s1.length();
l=s1;
}
s1="";
}
l(str,++i);
}
else
{
System.out.println(l);
}
}
public void main(String str)
{
str=str+" ";
int t=str.length();
max=0;
l(str,0);
}
}
