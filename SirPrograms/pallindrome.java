import java.io.*;
public class pallindrome
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
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the string");
String str=ob.readLine();
str=str+" ";
int t=str.length();
String s1="";
int k=0;
int i;
String s[]=new String[t];
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
s[k]=s1;
k++;
s1="";
}
}
for(i=0;i<k;i++)
{
if(pallin(s[i])==1)
{
System.out.println(s[i]);
}
}
}
}
