import java.io.*;
import java.util.*;
import java.math.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner ob =new Scanner(System.in);
        int t=ob.nextInt();
        while(t-->0)
            {
            
            long n=ob.nextInt();
            
            for(long i=n;i>0;i--)
                {
                    int flag=0;
                if(n%i==0)
                    {
                    for(long j=2;j<=i/2;j++)
                        {
                        if(i%j==0)
                           {  flag=1;
                            break;
                           }
                    }
                    if(flag==0)
                        {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        
    }
}