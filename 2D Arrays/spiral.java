import java.util.*;
class spiral
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
int r=0,c=-1,x=1;
for(i=0;i<n;i++)
{
int p=(int)Math.pow(-1,i);
for(j=0;j<(n-i);j++)
{
c=c+1*p;
a[r][c]=x;
x++;
}
for(j=0;j<(n-i-1);j++)
{
r=r+1*p;
a[r][c]=x;
x++;
}
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