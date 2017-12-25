import java.io.*;
public class SumOfEachRowAndColumn
{
public void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[n][n];int s1=0,s2=0,d1=0,d2=0;int i,j;
for (i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}
for (i=0;i<n;i++)
{

for(j=0;j<n;j++)
{
s1=s1+a[i][j];
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
s2=s2+a[i][j];
}}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
d1+=a[i][j];
}
else if((i+j)==2)
d2=d2+a[i][j];
}}
System.out.println(s1);
System.out.println(s2);
System.out.println(d1);
System.out.println(d2);
}
}
