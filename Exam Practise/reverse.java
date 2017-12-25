import java.io.*;
class reverse
{
public int leap(int y)
{
if(y%400==0 || y%100!=0 && y%4==0)
{
return 1;
}
else
{
return 0;
}
}
public  void main()throws IOException
{

BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the date");
String date=ob.readLine();
System.out.println("Input the day");
String day=ob.readLine();
System.out.println("Input the days");
int n=Integer.parseInt(ob.readLine());
int p1=date.indexOf("/");
int p2=date.lastIndexOf("/");
int y=Integer.parseInt(date.substring((p2+1)));
int d=Integer.parseInt(date.substring(0,p1));
int m=Integer.parseInt(date.substring((p1+1),p2));
String week[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int yy=y;
int xx=n;
while(n>365)
{
if(leap(y)==1)
{
n=n-366;
}
else
{
n=n-365;
}
y--;
}
n=n-d;
d=1;
if(leap(y)==1)
{
month[2]=29;
}
int i=m-1;
while(n>31)
{
n=n-month[i];
i--;
}
int x=month[i]-n;
if(x==0)
{
x++;
}
System.out.println(x+"/"+(i)+"/"+y);
for(i=1;i<=7;i++)
{
if(day.equals(week[i]))
{
break;
}
}
int ww=(int)Math.abs(((xx%7)-i));
if(ww<1)
{
ww=ww+7;
}
System.out.println(week[ww]);
}
}


