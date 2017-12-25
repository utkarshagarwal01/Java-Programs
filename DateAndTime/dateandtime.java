import java.io.*;
public class dateandtime
{
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the date and time");
String date=ob.readLine();
String time=ob.readLine();
System.out.println("Input the Date and time");
String date2=ob.readLine();
String time2=ob.readLine();
int d1=Integer.parseInt(date.substring(0,date.indexOf("/")));
int d2=Integer.parseInt(date2.substring(0,date2.indexOf("/")));
int h1=Integer.parseInt(time.substring(0,time.indexOf(":")));
int h2=Integer.parseInt(time2.substring(0,time2.indexOf(":")));
int m1=Integer.parseInt(time.substring((time.indexOf(":")+1)));
int m2=Integer.parseInt(time2.substring((time2.indexOf(":")+1)));
int h=0,m=0;
if((d2-d1)>2)
{
System.out.println("Invalid");
System.exit(0);
}
System.out.println("The Time Difference Is");
if(d1==d2)
{
h=h2-h1;
m=m2-m1;
if(m<0)
{
m=m+60;
}
System.out.println(h+""+":"+""+m);
}
else if((d2-d1)==1)
{
h=(23-h1)+(h2);
m=(60-m1)+m2;
if(m>=60)
{
m=m-60;
h++;
}
}
else 
{
h=(24-h1)+(h2);
m=(60-m1)+m2;
if(m>=60)
{
m=m-60;
h++;
System.out.println((h+24)+""+":"+""+m);
}
}
}
}
