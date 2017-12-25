import java.io.*;
public class Q5
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,f,s=0,j=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
for(i=0;i<t;i++)
{
s=0;
for(f=1;f<a[i];f++)
{
if(a[i]%f==0)
{
s=s+f;
}
}
if(s==a[i])
{
j=j+a[i];
}
}
System.out.println("Sum of perfect numbers = "+j);
}
}
