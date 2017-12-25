import java.io.*;
import java.util.*;
class GoldCoins
{
 public static void main(String[] args) throws IOException
{
long n=0;
Scanner ob=new Scanner(System.in);
while(true)
{
String s=ob.nextLine();
System.out.println(rec(Long.parseLong(s)));
}
}
public static long rec(long n)
{
if(n==0)
return 0;
if(n> (n/2)+(int)(n/3)+(int)(n/4))
return n;
else 
return rec(n/2)+rec(n/3)+rec(n/4);
}
}