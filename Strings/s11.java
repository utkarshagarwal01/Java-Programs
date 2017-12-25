/*
 * Input a string and print the longest word. 
 */
public class s11
{
void xyz(String s)
{
s=s+" ";
int t=s.length();
int i;
String s1="",s2="";
int max=0;
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.length()>max)
{
max=s1.length();
s2=s1;
}
s1="";
}
}
System.out.println(s2);
}
}
