import java.util.*;
 
class MaxSum
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int t=ob.nextInt();
while(t-->0)
{
int n=ob.nextInt();
int a[]=new int[n];
int max=-1000000001;
for(int i=0;i<a.length;i++) 
a[i]=ob.nextInt();
for(int i=0;i<a.length;i++)
{


int temp=a[i];
a[i]=1000001;
int b=compute(a);
if(b>max)
max=b;
a[i]=temp;
}
System.out.println (max);
}

}


public static int compute(int a[])
{

int maxEndingHere=a[0],maxSoFar=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]==1000001)
continue;
            /* calculate maxEndingHere */
            if (maxEndingHere < 0)
            maxEndingHere = a[i];
                else
            maxEndingHere += a[i];
 
            /* calculate maxSoFar */
            if (maxEndingHere >= maxSoFar )
               maxSoFar=maxEndingHere;
            }
        return (maxSoFar);

}
}
