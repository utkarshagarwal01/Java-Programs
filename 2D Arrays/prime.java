import java.util.*;
class prime
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size of the matrix"); 
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
System.out.println("Input the elements of the matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}
}
System.out.println("The prime elements with indexes are");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(check(a[i][j])==1)
{
System.out.println(a[i][j]+" "+i+" "+j);
}
}
}
}
public int check(int m)
{
int c=0;
int i;
for(i=1;i<=m;i++)
{
if(m%i==0)
{
c++;
}
}
if(c==2)
{
return 1;
}
else
{
return 0;
}
}
}