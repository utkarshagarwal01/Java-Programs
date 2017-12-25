import java.util.*;
class chec
{
 public void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
int flag=0,r,c,pd=0,sd=0;
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
if(i==j)
{
pd=pd+a[i][i];
sd=sd+a[i][n-i-1];
}
}
}
for(i=0;i<n;i++)
{r=0;c=0;
for(j=0;j<n;j++)
{
r=r+a[i][j];
c=c+a[j][i];
}
if(r!=pd || r!=sd || c!=pd || c!=sd)
{
flag=1;
}
}
if(flag==1)
{
System.out.println("No");
}
else
{
System.out.println("Yes");
}
}
}
