package Strings;
import java.io.*;
public class Sort_Merge
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter First String");
String str=ob.readLine();
int t1=str.length();
System.out.println("Enter Second String");
String st=ob.readLine();
int t2=st.length();
String a[]=new String[t1];
String b[]=new String[t2];
String c[]=new String[t1];
int k=0,l=0;
String s1="",s2="";str=str+" ";st=st+" ";
for(int i=0;i<=t1;i++)
{
char x=str.charAt(i);
if(x!=' ')
s1=s1+x;
else
{
a[k]=s1;
k++;
s1="";
}
}
for(int j=0;j<=t2;j++)
{
char x=st.charAt(j);
if(x!=' ')
s1=s1+x;
else
{
b[l]=s1;
l++;
s1="";
}
}
for(int i=0;i<k;i++)
{
for(int j=0;j<(k-1);j++)
{
if(a[j].compareTo(a[j+1])>0)
{
String t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(int i=0;i<l;i++)
{
for(int j=0;j<(l-1);j++)
{
if(b[j].compareTo(b[j+1])>0)
{
String t=b[j];
b[j]=b[j+1];
b[j+1]=t;
}
}
}
int f=1,i=0,j=0,h=0;
while(f<=(k+l))
{
if(i<k && j<l)
{
if(a[i].compareTo(b[j])<0)
{
c[h]=a[i];
h++;
i++;
}
else if(a[i].compareTo(b[j])>0)
{
c[h]=b[j];
j++;
}
else
{
c[h]=a[i];
h++;
i++;
j++;
}
f++;
}
if(i<k)
{
for (int t=i;t<k;t++)
{
c[h]=a[t];
h++;
}
}
if(j<l)
{
for (int t=i;t<k;t++)
{
c[h]=b[t];
h++;
}
}
for(int t=0;t<(k+l);t++)
System.out.print(c[t]+" ");
}
}
}
