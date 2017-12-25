public class n
{
public void xyz(String str, int n)
{
str=str.toUpperCase();
int t=str.length();int i;int s;
String s1=" ";
for(i=0;i<t;i++)
{
char x=str.charAt(i);
int as=(int)x;
as=as+n;
if(as>=90)
{
as=as-26;
}
System.out.print((char)as);
}
}
}