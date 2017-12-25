import java.io.*;
import java.util.*;
public class Solution1{
public static void xyz(String args[]) throws IOException{
Scanner ob=new Scanner(System.in);
int t=ob.nextInt();
while(t-->0)
{
int n=ob.nextInt();
int sum=0,i,j;
for(i=1;i<=(int)n/2;i++){
if(n%i==0)
{
sum+=i;
}
}
if(sum==n*2)
System.out.print("YES");
else
System.out.print("NO");

}
}
}