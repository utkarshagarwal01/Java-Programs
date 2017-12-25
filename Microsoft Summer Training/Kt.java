import java.io.*;
import java.util.*;
public class Kt
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int t=ob.nextInt();
while(t-->0)
{
int n=ob.nextInt();
int a[]=new int[n+1];int b[]=new int[n+1],c=0;
a[0]=0;
for(int i=1;i<=n;i++)
a[i]=ob.nextInt();
for(int i=1;i<=n;i++)
{
b[i]=ob.nextInt();
if(b[i]<=(a[i]-a[i-1]))
c++;
}
System.out.println(c);
}
}
}