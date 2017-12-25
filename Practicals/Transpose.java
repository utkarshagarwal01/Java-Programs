import java.io.*;
public class Transpose
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int m=Integer.parseInt(ob.readLine());
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[m][n];int i,j;
int b[][]=new int[n][m];
System.out.println("Enter elements");
for (i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=a[j][i];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print("   "+b[i][j]);
}
System.out.println();
}
}
}

