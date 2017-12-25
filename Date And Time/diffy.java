import java.io.*;
public class diffy
{
public int days(String d1)
{
int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int p,q,i,dn=0;
p=d1.indexOf("/");
int d=Integer.parseInt(d1.substring(0,p));
q=d1.lastIndexOf("/");
int m=Integer.parseInt(d1.substring(p+1,q));
int yy=Integer.parseInt(d1.substring(q+1));
if((yy%400==0)||(yy%100!=0)&&(yy%4==0))
{
month[2]=29;
}
if (d<=0||d>month[m]||m<=0||m>12||yy<0||yy>9999)
{
System.exit(0);
}
else
{
 
for(i=1;i<m;i++)
{
dn=dn+month[i];
}}
dn=dn+d;
return dn;
}
public int leapy(int y)
{
if((y%400==0)||(y%100!=0)&&(y%4==0))
{
return 1;
}
else
{
return 0;
}}
public int year(String date)
{
int q=date.lastIndexOf("/");
int yyy=Integer.parseInt(date.substring(q+1));
return yyy;
}
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 2dates");
String d1=ob.readLine();
String d2=ob.readLine();
int difference=0;
difference=days(d2)-days(d1);
for(int k=year(d1);k<year(d2);k++)
{
if(leapy(k)==1)
{
difference=difference+366;
}
else
{
difference=difference+365;
}}
System.out.println("The Difference is=" + "  " + difference);

}}

