import java.io.*;
public class MatrixMultiply
{
public static void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order of first matrix");
int m=Integer.parseInt(ob.readLine());
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[m][n];int i,j,k;
System.out.println("Enter Elements of First Matrix");
for (i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}
System.out.println("Enter Order Of Second Matrix");
int p=Integer.parseInt(ob.readLine());
int q=Integer.parseInt(ob.readLine());
int b[][]=new int[p][q];
System.out.println("Enter Elements of second matrix");
for (i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
b[i][j]=Integer.parseInt(ob.readLine());
}
}
if(n==p)
{
}
int c[][]=new int[m][q];
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
c[i][j]=0;
for(k=0;k<p;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
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