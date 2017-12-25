import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner ob=new Scanner(System.in);
        BigInteger sum= new BigInteger("1");
        for(int i=1;i<=100;i++)
        {
            sum=sum.multiply(BigInteger.valueOf(i));
        }
        System.out.print(sum);
    }}