public class malayalam
{
public int palin(String s)
{
int i,t=s.length();
String s1="";
for(i=t-1;i>=0;i--)
{
char x=s.charAt(i);
s1=s1+x;
}
if(s.equals(s1))
return 1;
else
return 0;
}
void main(String str)
{
int t=str.length();
String s1;
int i,j,x=palin(str);
if(x==1)
{
for(i=0;i<t/2;i++)
{
s1="";
for(j=i;j<t;j++)
{
s1=s1+str.charAt(j);
if(palin(s1)==1&&s1.length()>1)
System.out.println(s1);
}
}
}
}
}
