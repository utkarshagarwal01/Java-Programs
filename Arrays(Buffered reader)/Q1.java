import java.io.*;
public class Q1
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,s=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
System.out.println("Sum of elements");
for(i=0;i<t;i++)
{
s=s+a[i];
}
System.out.println(s);
}
}