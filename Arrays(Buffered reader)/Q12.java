import java.io.*;
public class Q12
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i,j,c,s=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
for(i=0;i<t;i=i+c)
{
c=0;
for(j=i;j<t;j++)
{
if(a[i]==a[j])
{
c++;
}
}
System.out.println("Frequency of "+a[i]+" is "+c+".");
}
}
}