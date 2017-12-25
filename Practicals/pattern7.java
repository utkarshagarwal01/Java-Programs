 
import java.io.*;
public class pattern7
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int n=Integer.parseInt(ob.readLine());
System.out.println("Enter elements");
int a[][]=new int[n][n];int i,j;
for (i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i+j)%2!=0)
{
System.out.print(a[i][j]);
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}