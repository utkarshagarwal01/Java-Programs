/*
 * To print Raja Ram Mohan Roy to Roy Mohan Ram Raja.
 */
public class s8
{
public void xyz(String s)
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
s1=s1+x;
}
else
{
s2=s1+s2;
s2=" "+s2;
s1="";
}
}
System.out.print(s2);
}
    }
