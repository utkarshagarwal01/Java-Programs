import java.util.*;
class checkidentity
{
 public void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
int flag=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j && a[i][i]!=1)
{
flag=1;
}
if(i!=j && a[i][j]!=0)
{
flag=1;
}
}
}
if(flag==1)
{
System.out.println(" No Identity Matrix");
}
else
{
System.out.println("Yes");
System.exit(0);
}
}
}
