 public class ponegze   
 {
     void xyz(int a[])
     {
         int i,po=0,neg=0,ze=0;
         int t=a.length;
         for(i=0;i<t;i++)
         {
             if(a[i]>0)
             {
                 po=po+1;
                }
                else if(a[i]==0)
                {
                 ze=ze+1;
                }
                else
                {
                 neg=neg+1;
                }
            }
            System.out.println("no. of positive are "+po);
            System.out.println("no. of zero's are "+ze);
            System.out.println("no. of negative are "+neg);
        }
    }