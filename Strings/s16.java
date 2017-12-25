/*
* Input a string and print the length of each word
*/
public class s16
{
public void xyz(String s)
{
s=s+" ";
int t=s.length();
int i,m=0;String s1="",s2="";
for(i=0;i<t;i++)
{
char x=s.charAt(i);

if(x!=' ')
{
s1=s1+x;
}
else
{
m=s1.length();
s2=s1;
s1="";
System.out.println(s2+" "+m);
}
}
}
}
