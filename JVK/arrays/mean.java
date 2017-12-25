 public class mean
 {
     void xyz(int a[])
     {
         int i,s=0;
         double d=0;
         int t=a.length;
         for(i=0;i<t;i++)
         {
             s=s+a[i];
             d=(double)s/t;
            }
            System.out.println(" "+d);
        }
    }