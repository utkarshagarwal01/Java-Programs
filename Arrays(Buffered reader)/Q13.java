import java.io.*;
public class Q13
{
public static void g(int a[])
{
int t=a.length;
int max=a[0];int min=a[0];int c[]=new int[t],k=0,p=c[0],q=c[0],i;
for(i=0;i<t;i=i+1)
{
if(a[i]>max)
{
max=a[i];
}
if(a[i]<min)
{
min=a[i];
}}
for(i=0;i<t;i=i+1)
{
if(a[i]!=max || a[i]!=min)
{
c[k]=a[i];
k++;
}
}
for(int h=0;h<k;h++)
{
if(c[h]>p)
{
p=c[h];
}
if(c[h]<q)
{
q=c[h];
}
}
System.out.print("the 2nd max is"+p);
System.out.print("the 2nd min is"+q);
}
}