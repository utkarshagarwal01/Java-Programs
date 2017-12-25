import java.io.*;
public class lol
{
public void function(String s1)
{
s1=s1+" ";
int t=s1.length();
int i,j;
String s2="";
int v=0,c=0;
for(i=0;i<t;i++)
{
char x=s1.charAt(i);
if(x!=' ')
{
s2=s2+x;
}
else
{
for(j=0;j<s2.length();j++)
{
char y=s2.charAt(i);
if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u')
{
v++;
}
else
{
c++;
}
}
System.out.println(" "+v+" "+c);
s2="";
}
}
}
public void main()
{
System.out.println("Input the String");
String s=ob.readLine();
s=s+" ";
int t=s.length();
String s[]=new String[t];
for(i=0;i<t;i++)
{
if(x!='!' || x!='?' || x!='.'