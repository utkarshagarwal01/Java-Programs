import java.io.*;
public class Q6
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Menu");
System.out.println("1: Lcm of 2 Nos.");
System.out.println("2: Check if the No. is Armstrong No.");
System.out.println("3: Sum of first and last digits");
System.out.println("4: Fibonacci Series");
System.out.println("Enter the choice");
int ch= Integer.parseInt(ob.readLine());
switch(ch)
{
case 1:
System.out.println("Enter the Nos.");
int a= Integer.parseInt(ob.readLine());
int b= Integer.parseInt(ob.readLine());
int i,l=1;
for(i=1;i<=(a*b);i=i+1)
{
if(i%a==0&&i%b==0)
{
l=i;
break;
}
}
System.out.println("LCM = "+l);
break;
case 2:
System.out.println("Enter the No.");
int n= Integer.parseInt(ob.readLine());
int c,t=0;
int x=n;
while(n!=0)
{
c=n%10;
t=t+(c*c*c);
n=n/10;
}
if(t==x)
System.out.println("the number is armstrong");
else
System.out.println("the number is not armstrong");
break;
case 3:
System.out.println("Enter The No.");
int p= Integer.parseInt(ob.readLine());
int g,q=0,m=0;
int last=p%10;
while(p!=0)
{
g=p%10;
q=(q*10)+g;
p=p/10;
}
int first=q%10;
m=first+last;
System.out.println("m");
break;
case 4:
System.out.println("Enter No.");
double k=Double.parseDouble(ob.readLine());
int j,w=0,r=1,d=3,u;
System.out.print(w+",");
System.out.print(r);
for(j=1;d<=k;j++)
{
u=w+r;
System.out.print(","+u);
w=r;
r=u;
d++;
}
break;
default:
System.out.println("Wrong character");
}
}
}