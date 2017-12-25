 import java.io.*;
 public class evenodd
 {
     public static void main(String args[])throws IOException
     {
         int i,ev=0,od=0;
         BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
         int a[]=new int[10];
         System.out.println("Enter 10 no. in the array");
         for(i=0;i<10;i++)
         {
             System.out.println("Enter no.-->"+(i+1));
             a[i]=Integer.parseInt(ob.readLine());
            }
            for(i=0;i<10;i++)
            {
                if(i%2==0)
                {
                od=od+a[i];
            }
            else
            {
                ev=ev+a[i];
            }
        }
            System.out.println("The sum of even no. is "+ev);
            System.out.println("the sum of oddd no. is "+od);
        }
    }
            