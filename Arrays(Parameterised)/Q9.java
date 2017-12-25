/**
 Input nos. in the array and print all the zeros first.
**/
public class Q9
{
public void xyz(int a[])
{
int i,f,j=0,k=0;
int t=a.length;
int b[]=new int[t];
for(i=0;i<t;i++)
{
if(a[i]==0)
{
b[k]=a[i];
k++;
}
}
for(i=0;i<t;i++)
{
if(a[i]!=0)
{
b[k]=a[i];
k++;
}
}
for(i=0;i<k;i++)
{
System.out.print(b[i]+",");
}
}
}
