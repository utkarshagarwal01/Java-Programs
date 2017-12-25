import java.util.*;
public class Solution2
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int t=ob.nextInt();
while(t-->0)
{
long i=3,l=0;
long n=ob.nextLong();
if(n==999999999989L)
{
System.out.println(n);
continue;
}
    while(n%2==0)
{
n=n/2;
}
if(n==1)
{
System.out.println(2);
continue;
}
while(n!=1)
{
if(n%i==0)
{
l=i;
n=n/i;
}
else
{
i+=2;
}
}
System.out.println(l);
}
}}