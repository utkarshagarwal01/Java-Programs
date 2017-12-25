import java.io.*;
public class Q10
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,s=0,f,j=0,k=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
int b[]=new int[t];
for(i=0;i<t;i++)
{
if(a[i]<0)
{
b[k]=a[i];
k++;
}
}
for(i=0;i<t;i++)
{
if(a[i]>=0)
{
b[k]=a[i];
k++;
}
}
for(i=0;i<k;i++)
{
System.out.print(b[i]+",");
}
}
}
