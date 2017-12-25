import java.io.*;
public class removestring
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input String");
String str=ob.readLine();
int n=str.length();

String s1=" ";
String a[]=new String [100];
int i,k=0;
for(i=0;i<n-1;i++)
{
char x=str.charAt(i);
char y=str.charAt(i+1);
if(x!=' ')
{
s1=s1+x;
}
else if(x==' '&& y!=' ')
{
s1=s1.trim();
a[k]=s1;
k++;
s1="";
}
}

for(i=0;i<k;i++)
{
System.out.print(a[i]+" ");
}
System.out.print(str.substring((str.lastIndexOf(' ')+1)));
}
}