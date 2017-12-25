package Strings;
import java.io.*;
public class Count
{
public static void main() throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String");
String str=ob.readLine();
int t=str.length();
String s="";
for(int i=0;i<t;i++)
{
char x=str.charAt(i);
if(x=='!' || x=='?' || x=='.')
{
int v=0,sp=0,w=0,d=0,u=0,l=0,spe=0,con=0;
System.out.println(s);
int a=s.length();
for(int j=0;j<a;j++)
{
char y=s.charAt(j);
if(y=='A' || y=='a' || y=='E' || y=='e' || y=='I' ||y=='i' || y=='O' || y=='o' || y=='U' || y=='u')
v++;
else if(y==' ')
sp++;
else if(Character.isDigit(y))
d++;
else if(Character.isUpperCase(y))
u++;
else if(Character.isLowerCase(y))
l++;
else
spe++;
w=sp+1;
con=a-(sp+v+spe+d);
}
System.out.println("Number Of Words="+w);
System.out.println("Number of Vowels="+v);
System.out.println("Number of Consonants="+con);
System.out.println("Number of Vowels="+v);
System.out.println("Number of Digits="+d);
System.out.println("Number of UpperCaes="+u);
System.out.println("Number of LowerCase="+l);
System.out.println("Number of Special Characters="+spe);
s="";
}
else
s=s+x;
}
}
}