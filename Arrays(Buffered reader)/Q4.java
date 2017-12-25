import java.io.*;
public class Q4
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,s=0,d=0,f;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
for(i=0;i<t;i++)
{
int c=0;
for(f=1;f<=a[i];f++)
{
if(a[i]%f==0)
{
c++;
}
}
if(c==2)
{
s=s+1;
d=d+a[i];
}
}
System.out.println("No. of prime numbers = "+s);
System.out.println("Sum of prime numbers = "+d);
}
}
