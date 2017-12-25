import java.io.*;
public class Check_Magic
{
public static void xyz()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter order");
int n=Integer.parseInt(ob.readLine());
int a[][]=new int[n+1][n+1];int i,j;int s1=0;int s2=0;int rd=0;int ld=0;
System.out.println("Enter Elements");
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
s1=s1+a[i][j];
s2=s2+a[j][i];
}
}
for(i=0;i<n;i++)
{
rd=rd+a[i][i];
ld=ld+a[i][n-i-1];
}
if(s1==s2 && rd==ld && rd==s1)
{
System.out.println("Magic Square");
}
else
{
System.out.print("Not a magic square");
}
}
}
