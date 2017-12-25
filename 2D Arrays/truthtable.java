import java.util.*;
class truthtable
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int c=n;
int r=(int)Math.pow(2,n);
int a[][]=new int[r][c];
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=0;
}
}
int x=0,y=0;
while(x<r)
{
i=x;
j=n-1;
y=x;
while(y!=0)
{
a[i][j]=y%2;
j--;
y=y/2;
}
x++;
}
int s;
for(i=0;i<r;i++)
{
s=0;
for(j=0;j<c;j++)
{
System.out.print(a[i][j]+" ");
s=s+a[i][j];
}
if(s==n)
{
System.out.print("1");
}
else
{
System.out.print("0");
}
System.out.println();
}
}
}
