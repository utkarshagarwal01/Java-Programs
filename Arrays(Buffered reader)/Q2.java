import java.io.*;
public class Q2
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,s=0,p=0,n=0,z=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
for(i=0;i<t;i++)
{
if(a[i]>0)
{
p=p+1;
}
else if (a[i]<0)
{
n=n+1;
}
else
{
z=z+1;
}
}
System.out.println("Number of positive numbers ="+p);
System.out.println("Number of negative numbers ="+n);
System.out.println("Number of Zero's ="+z);
}
}