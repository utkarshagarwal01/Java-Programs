import java.util.*;
class magic
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int i,j;
int a[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=0;
}}
int r=0,c=(n-1)/2;
a[r][c]=1;
int x=2;
while(x<=(n*n))
{
r--;
c++;
if(r<0 && c==n)
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
{}
a[r][c]=x;
x++;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]<10)
{
System.out.print(" "+a[i][j]+" ");
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