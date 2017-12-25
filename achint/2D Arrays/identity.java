import java.util.*;
class identity
{
 public void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
a[i][i]=1;
}
else
{
a[i][j]=0;
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}