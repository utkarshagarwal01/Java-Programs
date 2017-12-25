/**
   Input 2 arrays A and B and find :-
1. A∩B
2. A-B
3. B-A
**/
public class Q7_Combined
{
public void xyz(int a[],int b[])
{
int i,f,flag,j=0,k=0;
int m=a.length;
int n=b.length;
int c[]=new int[m];
System.out.print("A∩B =");
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
if(flag==1)
{
c[k]=a[i];
k++;
}
}
for(f=0;f<k;f++)
{
System.out.print(c[f]+",");
}
System.out.println();
int d,e,flag1,g=0,h=0;
int l[]=new int[m];
System.out.print("A-B =");
for(d=0;d<m;d++)
{
flag1=0;
for(g=0;g<n;g++)
{
if(a[d]==b[g])
{
flag1=1;
break;
}
}
if(flag1==0)
{
l[h]=a[d];
h++;
}
}
for(e=0;e<h;e++)
{
System.out.print(l[e]+",");
}
System.out.println();
int p,q,flag2,r=0,s=0;
int t[]=new int[m];
System.out.print("B-A =");
for(p=0;p<m;p++)
{
flag2=0;
for(r=0;r<n;r++)
{
if(b[p]==a[r])
{
flag2=1;
break;
}
}
if(flag2==0)
{
t[s]=b[p];
s++;
}
}
for(q=0;q<s;q++)
{
System.out.print(t[q]+",");
}
}
}