import java.io.*;
public class palinstring
{
public void main() throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str=ob.readLine();
int n=str.length();
int i,j,k=0;
String s1="";
String a[]=new String [n];
for(i=0;i<n;i++)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
a[k]=s1;
k++;
s1="";
}
}

for(i=0;i<k;i++)
{
if(palin(a[i])==1)
System.out.println(a[i]);
}
}
public int palin(String s)
{
int e,t;
char r;
String s1="";
for(e=0;e<s.length();e++)
{
r=s.charAt(e);
s1=r+s1;
}
if(s1.equals(s))
return 1;
else
return 0;
}
}
