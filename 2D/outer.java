import java.util.*;
class outer
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter size");
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
int b[]=new int[n*n];
int k=0;
System.out.println("Input the elements");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}
}
int r=0,c=-1,x=0;
for(i=0;i<2;i++)
{
int p=(int)Math.pow(-1,i);
for(j=0;j<n-i;j++)
{
c=c+1*p;
b[k]=a[r][c];
k++;
}
for(j=0;j<n-1-i;j++)
{
r=r+1*p;
b[k]=a[r][c];
k++;
}
}
for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;k++)
{
if(b[j]>b[j+1])
{
int temp=b[j];
b[j]=b[j+1];
b[j]=temp;
}
}
}
int sum=0;
for(i=0;i<k;i++)
{
sum=sum+b[i];
}
System.out.println("Sum"+""+sum);
k=0;
r=0;c=-1;x=0;
for(i=0;i<2;i++)
{
int p=(int)Math.pow(-1,i);
for(j=0;j<n-i;j++)
{
c=c+1*p;
a[r][c]=b[k];
k++;
}
for(j=0;j<n-1-i;j++)
{
r=r+1*p;
a[r][c]=b[k];
k++;
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==0 || j==(n-1) || j==0 || j==(n-1))
{
if(a[i][j]<10)
{
System.out.print(a[i][j]+"  ");
}
else
{
System.out.print(a[i][j]+" ");
}
}
else
{}
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]<10)
{
System.out.print(a[i][j]+"  ");
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