import java.io.*;
public class SpiralMatrix
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[n][n];
int r=0,c=-1;int x=0;int i,j;
for(i=0;i<n;i++)
{
int p=(int)Math.pow(-1,i);
for(j=0;j<n-i;j++)
{
c=c+1*p;
a[r][c]=++x;
}
for(j=0;j<(n-1-i);j++)
{
r=r+1*p;
a[r][c]=++x;
}}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]<10)
{
System.out.print(a[i][j]+"  ");
}
else
{
System.out.print(a[i][j]+" ");
}
}
System.out.println();
}
}
}
