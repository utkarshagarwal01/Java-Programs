/*
 * To print Raja Ram Mohan Roy as ajaR maR nahoM yoR.
 */
public class s10
{
void xyz(String s)
{
s=s+" ";
int t=s.length();
int i;String s1="",s2="";
for(i=0;i<t;i++)
{
char x=s.charAt(i);
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
}
System.out.print(s2);
}
}
