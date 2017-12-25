import java.io.*;
class vowel
{
public  boolean vow(char c)
{
if(c=='a' || c=='e' || c=='i' || c=='u' || c=='o')
{
return true;
}
else
{
return false;
}
}
public int check(char c)
{
if(c=='a')
{
return 0;
}
else if(c=='e')
{
return 1;
}
else if(c=='i')
{
return 2;
}
else if(c=='o')
{
return 3;
}
else if(c=='u')
{
return 4;
}
else
{return 5;
}
}
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the String");
String str=ob.readLine();
str=str+" ";
int l=str.length();
int i,j;
int a[][]=new int[5][5];
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
a[i][j]=0;
}}
for(i=1;i<l-1;i++)
{
char x=str.charAt(i);
char y=str.charAt(i+1);
if(vow(x)==true && vow(y)==true)
{
int p1=check(x);
int p2=check(y);
a[p1][p2]++;
}
}
char r[]={'a','e','i','o','u'};
for(i=0;i<5;i++)
{
System.out.print("\t"+r[i]);
}
System.out.println();
for(i=0;i<5;i++)
{
System.out.print(r[i]+"\t");
for(j=0;j<5;j++)
{
System.out.print(a[i][j]+" ");
System.out.print("\t");
}
System.out.println();
}
}
}
