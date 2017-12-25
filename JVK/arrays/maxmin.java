 import java.io.*;
 public class maxmin
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
            int max=a[0];
            int min=a[0];
            for(i=0;i<10;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
                else if(a[i]<min)
                {
                    min=a[i];
                }
            }
            System.out.println(min+" "+max);
        }
    }
            