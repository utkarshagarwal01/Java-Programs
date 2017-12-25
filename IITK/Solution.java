import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution {
    public static void main(String[] args) {
    Scanner ob =new Scanner(System.in);
    int t=ob.nextInt();
    BigInteger c=new BigInteger("100000");
    BigInteger two=new BigInteger("2");
    while(t-->0)
        {
    BigInteger n=new BigInteger(ob.next());
    Integer ans=Integer.parseInt(two.modPow(n,c).toString());
    System.out.println(ans-1);
    }  
}
}
    