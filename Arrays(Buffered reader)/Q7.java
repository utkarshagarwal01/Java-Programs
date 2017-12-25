import java.io.*;
public class Q7
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array A");
int m=Integer.parseInt(ob.readLine());
System.out.println("Enter size of the array B");
int n=Integer.parseInt(ob.readLine());
int a[]=new int [m];
int b[]=new int [n];
int c[]=new int [n];
int i,f,flag,j=0,k=0;
System.out.println("Enter the elements of array A");
for(i=0;i<m;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
System.out.println("Enter the elements of array B");
for(i=0;i<n;i++)
{
b[i]=Integer.parseInt(ob.readLine());
}
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