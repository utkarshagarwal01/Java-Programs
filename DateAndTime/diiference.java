import java.io.*;
class diiference
{
public int calcdays(String d)
{
int days=0;
int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int p= d.indexOf("/");
int q= d.lastIndexOf("/");
int yy=Integer.parseInt(d.substring(q+1));
if(yy%100==0)
{
if(yy%400==0)
{
m[2]++;
}
}
else if(yy%4==0)
{
m[2]++;
}
else
{}
int mm=Integer.parseInt(d.substring(p+1,q));
for(int i=1;i<=mm-1;i++)
{
days=days+m[i];
}
int dd=Integer.parseInt(d.substring(0,p));
days=days+dd;
return days;
}

public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the two dates");
String d1=ob.readLine();
String d2=ob.readLine();
System.out.println("The difference is");
int difference=calcdays(d2)-calcdays(d1);
System.out.println(difference);
}
}