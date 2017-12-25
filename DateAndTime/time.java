import java.io.*;
class time
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the time");
String s=ob.readLine();
String a[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty One","Twenty two","Twenty Three","Twenty Four","Twenty Five","Twenty Six","Twenty Seven","Twenty Eight","Twenty Nine"};
int hr=Integer.parseInt(s.substring(0,s.indexOf(":")));
int mm=Integer.parseInt(s.substring(s.indexOf(":")+1));
if(hr==12 && mm >30 && mm==45 )
{
System.out.println("Quarter to 1");
}
else if(hr==12 && mm >30 )
{
System.out.println(a[60-mm]+" "+"minutes to 1");
}
else if(mm==30)
{
System.out.println("Half Past"+" "+a[hr]);
}
else if(mm==15)
{
System.out.println("Quarter Past"+" "+a[hr]);
}
else if(mm==0)
{
System.out.println(hr+""+"o'clock");
}
else if(mm<30)
{
System.out.println(a[mm]+""+"bMinutes Past"+" "+a[hr]);
}
else if(mm==45)
{
System.out.println("Quarter To"+" "+a[hr+1]);
}
else
{
System.out.println(a[60-mm]+""+"to"+""+a[hr+1]);
}
}
}

