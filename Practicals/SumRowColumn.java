import java.io.*;
public class SumRowColumn
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[n][n];int r,c;int i,j;
System.out.println("Enter ele");
for (i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}
for (i=0;i<n;i++)
{
r=0;c=0;
for(j=0;j<n;j++)
{
r=r+a[i][j];
c=c+a[j][i];
}
System.out.println("Sum of rows "+(i+1)+" is"+r);
System.out.println("Sum of column "+(i+1)+" is"+c);
}
int rd=0,ld=0;
for(i=0;i<n;i++)
{
rd=rd+a[i][i];
ld=ld+a[i][n-1-i];
}
System.out.println(rd);
System.out.println(ld);
}
}