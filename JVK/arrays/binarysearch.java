 public class binarysearch
 {
    static void xyz(int a[],int ele)
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
            int beg=0,last=n-1;
            while(beg<last)
            {
               int mid=(beg + last)/2;
                {
                  if(a[mid]==ele)
                  {
                    int  flag=1;
                      break;
                    }
                    else if(a[mid]>ele)
                    {
                        last=mid-1;
                    }
                    else
                    {
                        beg=mid+1;
                    }
                 for(i=0;i<n;i++)
            
           {
            System.out.println(a[i]);
        }
    }
}
}
}
