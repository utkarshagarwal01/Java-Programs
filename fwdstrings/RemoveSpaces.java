 
import java.io.*;
public class RemoveSpaces
{
    public static void main()throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String str=ob.readLine();
        int t=str.length();str=str+" ";
        String s="",s2="";String a[]=new String[t];int k=0;
        String b[]=new String[t];
        for(int i=0;i<=t;i++)
        {
            char x=str.charAt(i);
            if(x!=' ')
            s=s+x;
            else
            {
                a[k]=s;
                k++;
                s="";
            }
        }
        int h=0;
        for(int i=0;i<k;i++)
        {
            if(a[i]!="")
            {
                b[h]=a[i];
                h++;
            }
        }
        for(int i=0;i<h;i++)
        System.out.print(b[i]+" ");
    }
}