public class dg
{
 void ppp(String str)
{
str=str+" ";
int t=str.length();
int i;String s1="";
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.equals("26"))
{
System.out.print("15"+" ");
}
else if(s1.equals("Republic"))
{
System.out.print("Independence"+" ");
}
else if(s1.equals("January"))
{
System.out.print("August"+" ");
}
else
{
System.out.print(s1+" ");
}
}
}
}
}
