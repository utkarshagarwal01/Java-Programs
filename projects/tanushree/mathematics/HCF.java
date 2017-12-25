
import java.io.*;
public class HCF
{
	void  fact() throws IOException
	{
	 BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	 int j=0;
	 System.out.println("for how many numbers do u want to know the HCF?");
	 int n=Integer.parseInt(in.readLine());
	 System.out.println("enter 1st number");
	 int a=Integer.parseInt(in.readLine());
	 int c=2;
	 int hcf=0;
	 int b=0;
	      for(int w=1; w<n; w++)
	   {
	     System.out.println("enter"+" "+c+" "+"number");
	     b=Integer.parseInt(in.readLine());
	    for(int i=1; i<=a;i++)
	    {
	        if(a%i==0 && b%i==0)
	        {
	            j=i;
	        }
	    }
	   a=j;
	   c++;
	}
	 System.out.println(a);
	}
	}
	    