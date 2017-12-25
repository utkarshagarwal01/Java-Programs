import java.io.*;
public class Q6
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,s=0,c=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
System.out.println("Enter the no. of which frequency is to be calculated");
int n=Integer.parseInt(ob.readLine());
for(i=0;i<t;i++)
{
if(n==a[i])
{
c++;
}
}
System.out.print("Frequncy of inputted element = "+c);
}
}