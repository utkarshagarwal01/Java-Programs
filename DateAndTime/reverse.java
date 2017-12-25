import java.io.*;
class reverse
{
public static void main()throws IOException
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
int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
if(n>365)
{
n=n-365;
y--;
}
n=n-d;
d=1;
int i=m-1;
while(n>28)
{
n=n-month[i];
i--;
}
d=month[i-1]-n;
System.out.println(d+"/"+i+"/"+y);
}
}

