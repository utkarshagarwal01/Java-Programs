import java.io.*;
public class time1
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

int h2=Integer.parseInt(time2.substring(0,q));
int m2=Integer.parseInt(time2.substring(q+1));
int m=0,h=0;
String a[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half","quarter"};
if(d1==d2)
{
 h=h2-h1;
 m=m2-m1;
 System.out.println(h+ ""+":"+""+m);
}
else if((d2-d1)==1)
{
h=(23-h1)+h2;
m=(60-m1)+m2;
if(m<0)
{
m=m+60;
h--;
}
if(m>=60)
{
m=m-60;
h++;
}}

else if((d2-d1)==2&&(h2-h1)>0)
{
h=(23-h1)+h2;
m=(60-m1)+m2;
if(m>=60)
{
m=m-60;
h++;
System.out.println((h+24)+""+":"+""+m);
}
else
{
System.out.println("Invalid");
}
}
}
}


