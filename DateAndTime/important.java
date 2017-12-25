import java.io.*;
public class important
{
public boolean leapyear(int y)
{
if(y%400==0 || y%100!=0 && y%4==0)
{
return true;
}
else
{
return false;
}
}
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the date");
String d=ob.readLine();
System.out.println("Input no of days");
int n=Integer.parseInt(ob.readLine());
int x=n;
int N=n;
System.out.println("Input the Day");
String day=ob.readLine();
int y=Integer.parseInt(d.substring((d.lastIndexOf("/")+1)));
int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int j;
if(leapyear(y)==true)
{
m[2]++;
}
String week[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int i=1;
while(n>m[i])
{
n=n-m[i];
i++;
}
for(j=1;j<=7;j++)
{
if(day.equals(week[j]))
{
break;}}
int wow=(x%7)+j;
if(wow>7)
{
wow=7-wow;
}
System.out.println(n+""+"/"+""+i+""+"/"+""+y);
System.out.println(week[wow-1]);

System.out.println("Input the days");
int dn=Integer.parseInt(ob.readLine());
N=N+dn;
int x1=N;
if(N>365)
{
N=N-365;
y++;
}
if(leapyear(y+1)==true)
{
m[2]=29;
}
else
{
m[2]=28;
}
i=1;
while(N>m[i])
{
N=N-m[i];
i++;
}
System.out.println(N+""+"/"+""+i+""+"/"+""+y);
for(j=1;j<=7;j++)
{
if(day.equals(week[j]))
{
break;}}
  x1=(x1%7)+j;
if(x1>7)
{
x1=7-x1;
}
System.out.println(week[x1-1]);
}
}