 
import java.io.*;
public class Space
{
public static void main() throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String In UpperCase");
String str=ob.readLine();
int t=str.length();
System.out.println("Enter An Integer");
int n=Integer.parseInt(ob.readLine());
String s1="",s2="";
if(n>26)
{
System.out.println("Invalid");
System.exit(0);
}
for(int i=0;i<t;i++)
{
char x=str.charAt(i);
int as=(int)x;
as=as+n;
if(as>90)
as=as-26;
char y=(char)as;
s1=s1+y;
}
int a=s1.length();
for(int i=0;i<a;i++)
{
char x=s1.charAt(i);
char z=s1.charAt(i+1);
if(x=='Q'&&z=='Q')
{
s2=s2+" ";
i++;
}
else
s2=s2+x;
}
System.out.print(s2);
}
}