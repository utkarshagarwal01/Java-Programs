import java.io.*;
public class spiral
{
public void main() throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(ob.readLine());
int a[][]=new int[n][n];
int i,j,r=0,c=-1,x=0;
for(i=0;i<n;i++)
{
int p=(int)Math.pow(-1,i);
for(j=0;j<n-i;j++)
{
c=c+1*p;
a[r][c]=++x;
}
for(j=0;j<n-1-i;j++)
{
r=r+1*p;
a[r][c]=++x;
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]<10)
System.out.print(a[i][j]+"  ");
else
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
