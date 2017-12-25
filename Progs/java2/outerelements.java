import java.io.*;
public class outerelements
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int m=Integer.parseInt(ob.readLine());
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[m][n];int i,j;
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
if(i==0||i==(n-1)||j==0||j==(n-1))
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
}
