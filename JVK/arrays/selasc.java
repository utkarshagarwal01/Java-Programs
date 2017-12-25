 public class selasc
 {
     void xyz(int a[])
     {
         int i,j;
         int n=a.length;
         for(i=0;i<(n-1);i++)
         {
             for(j=i+1;j<n;j++)
             {
                 if(a[i]>a[j])
                 {
                     int temp= a[i];
                     a[i]=a[j];
                     a[j]= temp;
                    }
                }
            }
            for(i=0;i<n;i++)
            
           {
            System.out.println(a[i]);
        }
    }
}