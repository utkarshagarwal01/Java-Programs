import java.io.*;
public class Q11
{
public static void main ()throws IOException
{
BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of the array");
int t=Integer.parseInt(ob.readLine());
int a[]=new int [t];
int i;
double x,m,s=0;
System.out.println("Enter the elements");
for(i=0;i<t;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
for(i=0;i<t;i++)
{
s=s+a[i];
}
x=s/t;
System.out.println("Mean = "+x);
if(t%2==0)
{
m=(a[t/2]+a[(t-1)/2])/2;
}
else
{
m=a[(t-1)/2];
}
System.out.println("Median = "+m);
int j,c,max=0,mode=0;
for(i=0;i<t;i++)
{
c=0;
for(j=0;j<t;j++)
{
if(a[i]==a[j])
{
c++;
}
}
if(c>max)
{
max=c;
mode=a[i];
}
}
System.out.println("Mode ="+mode);
}
}