 import java.io.*;
 public class sum
 {
     public static void main()throws IOException
     {
         int i,s=0;
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
                s=s+a[i];
            }
            System.out.println("The sum of the entered no. is"+s);
        }
    }
            