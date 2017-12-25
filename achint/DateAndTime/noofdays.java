import java.io.*;
class noofdays
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the date");
String d=ob.readLine();
System.out.println("Input the day on January 1");
String day=ob.readLine();
int days=0;
int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String w[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int y=Integer.parseInt(d.substring((d.lastIndexOf("/")+1)));
if(y%100==0)
{
if(y%400==0)
{
m[2]++;
}
}
else if(y%4==0)
{
m[2]++;
}
else
{}
int month=Integer.parseInt(d.substring((d.indexOf("/")+1),(d.lastIndexOf("/"))));
for(int i=1;i<month-1;i++)
{
days =days+m[i];
}
int dd=Integer.parseInt(d.substring(0,d.indexOf("/")));
days=days+dd;
int flag=0;
int wow=days%7;
for(int k=1;k<=7;k++)
{
if(w[k]==day)
{
flag=k; break;
}}
int ss=flag+wow;
if(ss>7)
ss=ss-7;
System.out.println(w[ss]);
}
}
