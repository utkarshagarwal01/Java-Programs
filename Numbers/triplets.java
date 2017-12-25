import java.io.*;
class triplets
{
public void main()throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Input the length of the array");
int n=Integer.parseInt(ob.readLine());
int a[]=new int[n];
System.out.println("Input the elements");
int i,j;
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(ob.readLine());
}
System.out.println("The output is");
int freq1=0,freq2=0,freq3=0;
for(i=0;i<n;i++)
{
if(a[i]==1)
{
freq1++;
}
if(a[i]==2)
{
freq2++;
}
if(a[i]==3)
{
freq3++;
}
}
int smallest,largest,middle;

int a1[]={freq1,freq2,freq3};
String s[]={"1","2","3"};
for(i=0;i<3;i++)
{
for(j=0;j<3-i-1;j++)
{
if(a1[j]>a1[j+1])
{
int temp=a1[j];
String temp1=s[j];
a1[j]=a1[j+1];
s[j]=s[j+1];
a1[j+1]=temp;
s[j+1]=temp1;
}
}
}
largest=a1[2];
smallest=a1[0];
middle=a1[1];
for(i=1;i<=smallest;i++)
{
System.out.println("1,2,3");
}
for(i=smallest+1;i<=middle;i++)
{
System.out.println(s[2]+","+s[1]);
}
for(i=middle+1;i<=largest;i++)
{
System.out.println(s[2]);
}
}
}
