/*
* To print Raja Ram Mohan Roy to yoR nahoM maR ajaR.
*/
public class s9
{
void xyz(String s)
{
s=s+" ";
String s1="",s2="";
int t=s.length();
int i;
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x!=' ')
{
s1=x+s1;
}
else
{
s2=s1+s2;
s2=" "+s2;
s1="";
}
}
System.out.print(s2);           }}