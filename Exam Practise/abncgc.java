public class abncgc
{
public static void xyz(String str)
{
str=str+" ";
String s1="";
int t =str.length();
int i;
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
System.out.print(Character.toUpperCase(s1.charAt(0)));
System.out.print(s1.substring(1));
System.out.print(" ");
s1="";
}}}}
