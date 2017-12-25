import java.util.*;
class genmagic
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the limit");
int n=ob.nextInt();
int a[][]=new int[n+1][n+1];
int i,j;
int x=0;
int r=0;
int c=(n-1)/2;
a[r][c]=++x;
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
a[r][c]=++x;
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
