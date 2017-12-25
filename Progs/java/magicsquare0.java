import java.io.*;
public class magicsquare0
{
public static void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");

int n=Integer.parseInt(ob.readLine());
int a[][]=new int[n+1][n+1];int i,j;
for (i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=0;
}
}
int r=0;int c=(n-1)/2;int x=1;
a[r][c]=x;
while(x<=(n*n))
{
r--;
c++;
if(r<0&&c==n)
{
r=r+2;
c--;
}
else if(r<0)
{
r=r+n;
}
else if(c==n)
{
c=0;
}
else if(a[r][c]!=0)
{
r=r+2;
c--;
}
else
{
}
a[r][c]=++x;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]<10)
System.out.print(" "+a[i][j]+" ");
else 
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
