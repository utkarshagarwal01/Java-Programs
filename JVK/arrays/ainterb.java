public class ainterb
 {
     void main(int a[],int b[])
     {
         int t=a.length;
         int t1=b.length;
         int c[]=new int[t];
         int k=0,d=0,i,j;
         for(i=0;i<t;i++)
         {
             d=0;
             for(j=0;j<t1;j++)
             {
                 if(a[i]==b[j])
                 {
                     d=1;
                    }
                }
                if(d==1)
                {
                    c[k]=a[i];
                    k++;
                }
            }
                for(i=0;i<k;i++)
                {
                    System.out.print(c[i]+",");
        }
}
}
