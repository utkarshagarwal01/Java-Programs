import java.io.*;
public class countinsentences
{
public void main() throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str=ob.readLine();
int n=str.length();
int i,j,c,k=0;
String s1="";
for(i=0;i<n;i++)
{
char x=str.charAt(i);
if(x=='?'||x=='!'||x=='.')
{
int p=0;
int q=0;
for(c=0;c<s1.length();c++)
{
char y=s1.charAt(c);
if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
p++;
else if (y!=' ') 
q++;
}
System.out.print(s1+" "+p+" "+q);

System.out.println();
s1="";
}
else
{
s1=s1+x;
}
}
}
}