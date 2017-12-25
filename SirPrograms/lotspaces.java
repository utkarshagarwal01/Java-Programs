import java.io.*;
class lotspaces
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the string");
String str=ob.readLine();
int l=str.length();
int i;
String s[]=new String[l];
int k=0;
String s1="";
for(i=0;i<l-1;i++)
{
char x=str.charAt(i);
char y=str.charAt(i+1);
if(x!=' ')
{
s1=s1+x;
}
else if(x==' ' && y!=' ' )
{
s[k]=s1;
k++;
s1="";
}
}
for(i=0;i<k;i++)
{
System.out.print(s[i]+" ");
}
System.out.print(str.substring((str.lastIndexOf(' ')+1)));
System.out.println("Input the number");
int k1=Integer.parseInt(ob.readLine());
for(i=0;i<k;i++)
{
if(k1==(i+1))
{}
else
{
System.out.print(s[i]+" ");
}
}
}
}


