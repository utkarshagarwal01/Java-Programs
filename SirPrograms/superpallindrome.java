import java.io.*;
public class superpallindrome
{
public int pallin(String s)
{
int t=s.length();
String s1="";
for(int i=0;i<t;i++)
{
char x=s.charAt(i);
s1=x+s1;
}
if(s1.equals(s))
{
return 1;
}
else
{
return 0;
}
}
public void blabla()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str=ob.readLine();
str=str+" ";
int t=str.length();
int i,j;
String s1="";
for(i=0;i<t/2;i++)
{
s1="";
for(j=i;j<t;j++)
{
s1=s1+str.charAt(j);
if(pallin(s1)==1 && s1.length()>1)
{
System.out.println(s1);
}
}
}
}
}

