import java.util.*;
class saddle
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the size");
int n=ob.nextInt();
int a[][]=new int[n][n];
System.out.println("Input the elements");
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}}
int max=0;
int min=0;
int k=0;
int rm[]=new int[n];
int cm[]=new int[n];
for(i=0;i<n;i++)
{
min=a[0][i];
for(j=0;j<n;j++)
{
if(a[i][j]>max)
{
max=a[i][j];
}
if(a[j][i]<min)
{
min=a[j][i];
}
}
rm[k]=max;
cm[k]=min;
k++;
}
int flag=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(rm[i]==cm[j])
{
flag=1;
break;
}}
break;
}
if(flag==1)
{
System.out.println(rm[i]);
}
else
{
System.out.println("No saddle point");
}
}
}

