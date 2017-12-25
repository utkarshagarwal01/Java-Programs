 public class mode
 {
     void xyz(int a[])
     {
         int max=0,mode=0;
         int t=a.length,c=0,i,j;
         for(i=0;i<t;i=i+c)
         {
             c=0;
             for(j=0;j<t;j++)
             {
                 if(a[i]==a[j])
                 {
                     c++;
                    }
                }
                if(c > max)
                {
                    max=c;
                    mode=a[i];
                }
            }
            System.out.println(mode);
        }
    }