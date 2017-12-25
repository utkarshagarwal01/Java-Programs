import java.io.*;
public class outer
{
public void main() throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size");
int n = Integer.parseInt(ob.readLine());
int a[][]=new int[n][n];
int b[]=new int [n*n];
int i,j,k=0,r=0,c=-1,x=0;
System.out.println("Enter elements");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(ob.readLine());
}
}

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
for(j=0;j<k-1-i;j++)
{
if(b[j]>b[j+1])
{
int temp=b[j];
b[j]=b[j+1];
b[j+1]=temp;
}
}
}
r=0;c=-1;x=0;
k=0;
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
if(i==0||j==n-1||j==0||i==n-1)
{

if(a[i][j]<10)
System.out.print(a[i][j]+"  ");
else
System.out.print(a[i][j]+" ");

System.out.println();
}
}
}
}
}