import java.io.*;
public class time
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter time in hh:mm format");
String time=ob.readLine();
int p;
p=time.indexOf(":");
int hh=Integer.parseInt(time.substring(0,p));
int mm=Integer.parseInt(time.substring(p+1));
String a[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half","quarter"};
if(hh==12&&mm>30&&mm==45)
{
System.out.println("Quarter to one");
} 
else if(hh==12&& mm>30)
{
System.out.println(a[60-mm]+" "+"minutes to one");
}
else if(hh==12&&mm==45)
{
System.out.println("Quarter to one");
}
else if (mm==0)
{
System.out.println(hh+"o' clock");
}
else if(mm==15)
{
System.out.println("Quarter past"+a[hh]);
}
else if(mm==30)
{
System.out.println("half past"+" "+a[hh]);
}
else if(mm>0&&mm<30)
{
System.out.println(a[mm]+" "+"minutes past"+" "+a[hh]);
}


else if(mm==45)
{
System.out.println("Quarter to"+" "+(a[hh+1]));
}

else 
{
System.out.println(a[60-mm]+" "+"minutes to"+" "+(a[hh+1]));
}

}}