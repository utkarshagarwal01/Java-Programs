public class happy
{
public void xyz(int n)
{
int x=n;
int t=n;
int k=0,i,flag=0;
int b[]=new int [1000];
while(n!=1)
{
int s=0;
x=n;
while(x!=0)
{
int a=x%10;
s=s+(a*a);
x=x/10;
}
n=s;
b[k]=s;
k++;
for(i=0;i<k-1;i++)
{
if(b[i]==s)
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.print("Not happy");
break;
}
}
if(n==1)
{
System.out.print("Happy Number"+t);
}
}
}