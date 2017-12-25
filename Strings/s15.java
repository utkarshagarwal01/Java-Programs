/*
* Input a string and print the frequency of letters of the inpputed word.
*/
public class s15
{
void xyz(String s,String w)
{
s=s+" ";
int t=s.length();
int i;int c=0;
String s1="",s2="";
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.equals(w))
{
int g=s1.length();
for(int j=0;j<g;j++)
{
c++;
}
s2=s1;
}
s1="";
}
}
System.out.print(s2+" "+c);    
}
}