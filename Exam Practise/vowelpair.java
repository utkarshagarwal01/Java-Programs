import java.io.*;
public class vowelpair
{
public static void main() throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str=ob.readLine();
int n=str.length();
int i,j,k;
char s[]={'a','e','i','o','u'};
int a[][]=new int [5][5];
for(i=0;i<n-1;i++)
{
char x=str.charAt(i);
char y=str.charAt(i+1);
for(j=0;j<5;j++)
{
for(k=0;k<5;k++)
{
if(x==s[j] && y==s[k])
{
a[j][k]=a[j][k]+1;
}
}
}
}

for(i=0;i<5;i++)
{
System.out.print("\t"+s[i]);
}
System.out.println();
for(i=0;i<5;i++)
{
System.out.print(s[i]+"\t");
for(j=0;j<5;j++)
{
System.out.print(a[i][j]+" ");
System.out.print("\t");
} 
System.out.println();
}
}}