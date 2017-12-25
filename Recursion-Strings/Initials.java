public class Initials
{
int t;
public void initials(String str,int i)
{
t=str.length();
if(i<t)
{
if(str.charAt(i)==' ')
{
System.out.print(str.charAt(i+1));
}
initials(str,++i);
}
else
{
return;
}}
public void main(String str)
{
str=" "+str;
int t=str.length();
initials(str,0);
}
}