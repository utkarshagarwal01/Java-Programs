import java.util.*;
class keeth
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number");
int n=ob.nextInt();
int s=0;int b;
int arr[]=new int[n];
int x=n;
while(n!=0)
{
int a=n%10;
s=s*10+a;
n=n/10;
}
int k=0;
while(s!=0)
{
b=s%10;
arr[k]=b;
k++;
s=s/10;
}
int p=0,t=0;
while(p<x)
{
s=0;
for(int i=t;i<k;i++)
{
p=p+arr[i];
}
arr[k]=p;
k++;
t++;
}
if(p==x)
{
System.out.println("A keeth number");
}
else
{
System.out.println("Not a keeth Number");
}
}
}