import java.util.*;
 
class MaxSum1
{
public static void main(String args[])
{
Scanner ob=new Scanner(System.in);
int t=ob.nextInt();
while(t-->0)
{
int n=ob.nextInt();
int a[]=new int[n];
int flag = 0;
int i;
for(i=0;i<n;i++)
a[i] = ob.nextInt();
int maxEndingHere=a[0],maxSoFar=a[0];
for(i=1;i<a.length;i++)
{
if((maxEndingHere + a[i]) < 0 && (i+1)< n && ((maxEndingHere + a[i+1]) > maxSoFar )&& flag == 0)
        {
             flag++;
             continue;
            }   
    if((maxEndingHere +a[i]) > 0)
        {
            maxEndingHere = maxEndingHere + a[i];       
        }
        if(maxEndingHere > maxSoFar)
        maxSoFar = maxEndingHere;
        if(a[i] < 0 && flag != 0 )
        {   
            flag = 0;
            maxEndingHere = a[i];
        }
    }
System.out.print("Max Sum" + maxSoFar);
}
}
}
