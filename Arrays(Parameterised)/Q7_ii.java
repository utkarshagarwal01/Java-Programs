/**
   Input 2 arrays A and B and find :-
1. A∩B
2. A-B
3. B-A
**/
public class Q7_ii
{
public void xyz(int a[],int b[])
{
int i,f,flag,j=0,k=0;
int m=a.length;
int n=b.length;
int c[]=new int[m];
System.out.print("A-B =");
for(i=0;i<m;i++)
{
flag=0;
for(j=0;j<n;j++)
{
if(a[i]==b[j])
{
flag=1;
break;
}
}
if(flag==0)
{
c[k]=a[i];
k++;
}
}
for(f=0;f<k;f++)
{
System.out.print(c[f]+",");
}
}
}
