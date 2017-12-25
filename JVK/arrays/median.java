/**
 * to find the median in the inputted array.
 */

 public class median
 {
     void xyz(int a[])
     {
         int t=a.length;
         int x1,x2;
         double med=0;
         if(t%2==0)
         {
            x1=t/2;
            x2=(t/2)-1;
            med=(double)(a[x1]+a[x2])/2;
        }
        else 
         {
            x1=(t-1)/2;
            med=a[x1];
        }
        System.out.println(med);
    }
}