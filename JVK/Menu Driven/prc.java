 public class prc
 {
     void xyz(String s)
     {
         int t=s.length();
         int i,j;
         String s1="",s2="";
         for(i=0;i<t;i++)
         {
             char x=s.charAt(i);
             int n=(int)x;
             if(n>=97 && n<=122)
             {
                 s1=s1+(char)n;
                }
               if(n>=65 && n<=90)
               {
                   s2=s2+(char)n;
                }
            }
            System.out.println(s1+s2);
        }
    }
            