import java.io.*;
public class timediffbetweendatesindiffmonths
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter time in hh:mm format and date");
String date=ob.readLine();
String date2=ob.readLine();
String time=ob.readLine();
String time2=ob.readLine();
int p,q,r,s;
p=time.indexOf(":");
q=time2.indexOf(":");
r=date.indexOf("/");
s=date2.indexOf("/");
int d1=Integer.parseInt(date.substring(0,r));
int d2=Integer.parseInt(date2.substring(0,s));
int h1=Integer.parseInt(time.substring(0,p));
int m1=Integer.parseInt(time.substring(p+1));
int mon1=Integer.parseInt(date.substring(r+1));
int mon2=Integer.parseInt(date2.substring(s+1));
int h2=Integer.parseInt(time2.substring(0,q));
int m2=Integer.parseInt(time2.substring(q+1));
int m=0,h=0;
int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int days=0;
if(mon1!=mon2)
{
for(int i=(mon1+1);i<mon2;i++)
{
days=days+month[i];
}
int daysdiff1= month[mon1]-d1-1;
int daysdiff2=d2;
int totdays= daysdiff1+daysdiff2+days;
int timediff=totdays*24*60;
int times2=h2*60+m2;
int times1=(23-h1)*60+(60-m1);
int tottime=timediff+times2+times1;
System.out.print(tottime);
}
else
{
int times2=d2*24*60 + h2*60 +m2;
int times1=d1*24*60 + h1*60 +m1;
System.out.print(times2-times1);
}
}}