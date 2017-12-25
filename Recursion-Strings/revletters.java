public class revletters
{
String s1="",s2="";
int t;
public void reveachword(String str,int i)
{
t=str.length();
if(i<t)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=x+s1;
}
else
{
s2=s2+s1;
s2=s2+" ";
s1="";
}
reveachword(str,++i);
}
else{
System.out.println(s2);
}
}
public void main(String str)
{
str=str+" ";
t=str.length();
reveachword(str,0);
}
}
