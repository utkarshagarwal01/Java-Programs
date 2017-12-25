package Strings;
import java.io.*;
public class Shift
{
public static void main() throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String In Uppercase");
String str=ob.readLine();
int t=str.length();
System.out.println("Enter An Integer");
int n=Integer.parseInt(ob.readLine());
String s="";str=str+" ";
for(int i=0;i<=t;i++)
{
    char x=str.charAt(i);
    int as=(int)x;
    if(x!=' ')
    {
    as=as+n;
    if(as<65)
    as=as+26;
    if(as>90)
    as=as-26;
    }
    System.out.print((char)as);
}
}
}