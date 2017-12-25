import java.io.*;
class lengthwise
{
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the string");
String str=ob.readLine();
str=str+" ";
int t=str.length();
String s[]=new String[t];
int i,j;
int k=0;
String s1="";
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
s[k]=s1;
k++;
s1="";
}
}
for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;j++)
{
if(s[j].length()>s[j+1].length())
{
String temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
else if(s[j].length()==s[j+1].length())
{
if((s[j].compareTo(s[j+1]))>0)
{
String temp2=s[j];
s[j]=s[j+1];
s[j+1]=temp2;
}
}
else
{}
}
}
for(i=0;i<k;i++)
{
System.out.print(s[i]+" ");
}
}
}

