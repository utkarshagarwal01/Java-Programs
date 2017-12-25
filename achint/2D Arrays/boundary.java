import java.util.*;
class boundary
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size of the matrix");
int n=ob.nextInt();
int a[][]=new int[n][n];
System.out.println("Input the elements in the matrix");
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}
}
int b[]=new int[n*n];
int k=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1) || j==0 || j==(n-1))
{
b[k]=a[i][j];
k++;
if(a[i][j]<10)
{
System.out.print(" "+a[i][j]+" ");
}
else
{
System.out.print(a[i][j]+" ");
}
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(b[j]>b[j+1])
{
int swap=b[j];
b[j]=b[j+1];
b[j+1]=swap;
}
}
}
int r=0,c=-1,p,f=0;
for(i=0;i<n;i++)
{
p=(int)Math.pow(-1,i);
for(j=0;j<(n-i);j++)
{
c=c+1*p;
if(r==0 || r==(n-1) || c==0 || c==(n-1))
{
a[r][c]=b[f];
f++;
}
else
{
a[r][c]=0;
}
}
for(j=0;j<(n-i-1);j++)
{
r=r+1*p;
if(r==0 || r==(n-1) || c==0 || c==(n-1))
{
a[r][c]=b[f];
f++;
}
else
{
a[r][c]=0;
}}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || i==(n-1) || j==0 || j==(n-1))
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
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
