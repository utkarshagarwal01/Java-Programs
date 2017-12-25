import java.io.*;
public class Selection_Descending
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,j,s=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
for(i=0;i<(t-1);i++)
{
for(j=i+1;j<t;j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<t;i++)
{
System.out.println(a[i]);
}
}
}