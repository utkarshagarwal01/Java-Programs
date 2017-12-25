import java.io.*;
public class Add_Matrix
{
public static void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int m=Integer.parseInt(ob.readLine());
int n=Integer.parseInt(ob.readLine());
System.out.println("Enter Elements Of First Matrix");
int a[][]=new int[m][n];int i,j;
int b[][]=new int[m][n];
int c[][]=new int[m][n];
for (i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}
System.out.println("Enter Elements Of Second Matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=Integer.parseInt(ob.readLine());
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(c[i][j]<10)
System.out.print(" "+c[i][j]+" ");
else
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}