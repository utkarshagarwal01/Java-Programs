import java.util.*;
public class outele
{
public static void main ()
{
Scanner ob=new Scanner (System.in);
System.out.println("Enter order of matrix");
int b=new int[] 
int r=0,c=-1,i,j;
for(i=0;i<2;i++)
{
int p=(int)Math.pow(-1,i);
for(j=0;j<(2-i);j++)
{
c=c+1*p;
b[x]=a[r][c];
x++;
for(j=0;j<2-1-i;j++)
{
r=r+1*p;
b[x]=a[r][c];
x++;
}
}
for(i=0;i<x;i++)
{
for(j=0;j<x-1-i;j++)
{
if(a[j]<a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}}}
for(i=0;i<x;i++)
{
System.out.println(a[j]);
}}}}