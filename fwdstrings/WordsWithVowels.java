 
import java.io.*;
public class WordsWithVowels
{
    public static void main()throws IOException
        {
            BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter String");
            String str=ob.readLine();
            int t=str.length();str=str+" ";
            String s1="";
            for(int i=0;i<=t;i++)
            {
                 char x=str.charAt(i);
                 if(x!=' ')
                 s1=s1+x;
                 else
                 {
                     char v=s1.charAt(0);
                     if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U'||v=='a'||v=='e'||v=='i'||v=='o'||v=='u')
                     System.out.println(s1);
                     s1="";
                    }
                }
            }
        }