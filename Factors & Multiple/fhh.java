public class fhh
{
public void xyz(int n)
{
int i;
int a[]=new int [n];
for(i=0;i<n;i++)
{
a[i]=i+1;
}
int g=2;
int k=0;
while(g<n)
{
for(i=0;i<n;i++)
{
if((i+1)%g==0)
{
}
else
{
a[k]=a[i];
k++;
}
}
g++;
n=k;
k=0;
}
for(i=0;i<k;i++)
{
System.out.print(a[i]+" ");
}
}
}