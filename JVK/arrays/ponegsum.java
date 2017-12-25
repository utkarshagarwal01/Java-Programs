 public class ponegsum  
 {
     void xyz(int a[])
     {
         int i,po=0,neg=0,ze=0;
         int t=a.length;
         for(i=0;i<t;i++)
         {
             if(a[i]>0)
             {
                 po=po+a[i];
                }
                else
                {
                 neg=neg+a[i];
                }
            }
            System.out.println("no. of positive are "+po);
            System.out.println("no. of negative are "+neg);
        }
    }