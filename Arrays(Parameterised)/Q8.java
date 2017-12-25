public class Q8
{
public void xyz(int a[],int element)
{
int i,f,k=0,t=a.length;
int b[]=new int [t];
for(i=0;i<t;i++)
{
if(a[i]!=element)
{
b[k]=a[i];
k++;
}
}
for(f=0;f<k;f++)
{
System.out.print(b[f]+",");
}
}
}