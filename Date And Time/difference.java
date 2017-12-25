import java.io.*;
public class difference
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
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 2dates in dd/mm/yyyy format");
String d1=ob.readLine();
String d2=ob.readLine();
int difference=days(d2)-days(d1);
System.out.println("The difference is="+" "+ difference);
}}
