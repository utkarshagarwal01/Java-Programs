public class shortestword
{
String s1="",s="";
int t,min;
public void s(String str,int i)
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
if(s1.length()<min){
min=s1.length();
s=s1;
}
s1="";
}
s(str,++i);
}
else
{
System.out.println(s);
}
}
public void main(String str)
{
str=str+" ";
t=str.length();
min=t;
s(str,0);
}
}
