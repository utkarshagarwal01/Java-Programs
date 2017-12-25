public class Truth_table
{
public void xyz(int n)
{
int a[][]=new int[(int)Math.pow(2,n)][n];
int i,j;int m;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=0;
}
}
int x=0;int y;int rows=(int)Math.pow(2,n);
for(m=0;m<=n;m++)
{

while(x<rows)
{
j=n-1;
x=i;
y=x;
while(y!=0)
{
a[i][j]=y%2;
j--;
}
y/=2;
x++;
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" , ");
}
System.out.println();
}
}
}}
