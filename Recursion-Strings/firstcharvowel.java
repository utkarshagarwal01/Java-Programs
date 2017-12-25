public class firstcharvowel
{
String s1="",s2="";
int t;
public void vowels(String str,int i)
{
int t=str.length();
if(i<t)
{
char x=str.charAt(i);
if(x!=' '){
s1=s1+x;
}else{
char y=s1.charAt(0);
if(y=='A'||y=='E'||y=='I'||y=='O'||y=='U')
{
System.out.println(s1);
}
s1="";
}
vowels(str,++i);
}
else
{
return;
}
}
public void main(String str)
{
str=str+" ";
int t=str.length();
vowels(str,0);
}
}
