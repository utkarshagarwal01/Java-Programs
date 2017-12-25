public class strrr
{
public void str(String s)
{
s.trim();
int p=s.lastIndexOf(' ');
int i;
String s1="",s2="";
for(i=0;i<=p;i++)
{
char x=s.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else if(x==' ' && (s.charAt(i+1))==' ')
{
continue;
}
else if(x==' ' && (s.charAt(i+1))!=' ')
{
s2=s2+s1;
s2=s2+" ";
s1="";
}
else
{}
}
System.out.print(s2);
s=s+'.';
System.out.print(s.substring(p+1));
}
}
