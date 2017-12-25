import java.io.*;
public class Q8
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,s=0,k=0,f;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
System.out.println("Enter element to be deleted from array");
int element=Integer.parseInt(ob.readLine());
int b[]=new int [t];
for(i=0;i<t;i++)
{
if(a[i]!=element)
{
b[k]=a[i];
k++;
}
}
for(f=0;f<k;f++)
{
System.out.print(b[f]+",");
}
}
}