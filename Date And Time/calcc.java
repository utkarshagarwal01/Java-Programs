import java.io.*;
public class calcc
{
public static void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
int month[]={0,31,28,31,30,31,30,31,30,31,31,30,31,30,31};
String days[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
System.out.println("Enter the date in dd/mm/yyyy format");
String date=ob.readLine().trim();
int p,q;
p=date.indexOf("/");
int d=Integer.parseInt(date.substring(0,p));
q=date.lastIndexOf("/");
int m=Integer.parseInt(date.substring(p+1,q));
int y=Integer.parseInt(date.substring(q+1));
 int i;
if((y%400==0)||(y%100!=0)||(y%4==0))
{
month[2]=29;
}
if(m<=0||m>12||d<=0||d>month[m]||y<0||y>9999)
{
System.out.println("Invalid date");
}
else
{
int dn=0;
for(i=0;i<m;i++)
{
dn=dn+month[i];
}
dn=dn+d;
System.out.println("Enter the day on 1st january in this year");
String s=ob.readLine().trim();
int x=0;
for(i=1;i<=7;i++)
{
if(s.equalsIgnoreCase(days[i]))
x=i;
}
for(i=1;i<dn;i++)
{
x++;
if(x==8)
x=1;
}
System.out.print("Output: "+d+"/"+m+"/"+y+"is a " +days[x]);
}
}
}
