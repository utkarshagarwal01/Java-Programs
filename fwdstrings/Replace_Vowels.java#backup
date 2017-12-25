package Strings;
import java.io.*;
public class Replace_Vowels
{
public static void main() throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String");
String str=ob.readLine();
int t=str.length();
String s="";str=str+" ";
for(int i=0;i<=t;i++)
{
    char x=str.charAt(i);
    if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
    {
        int as=(int)x;
        char y=(char)(as+1);
        s=s+y;
    }
    else
    s=s+x;
}
System.out.println(s);
}
}