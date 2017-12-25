
/**
 * Write a description of class LCm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class LCM
{
	void multi() throws IOException
	{   
	     BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	    System.out.println("for how many numbers do u want to know the LCM?");
	    int n=Integer.parseInt(in.readLine());
	   System.out.println("enter 1st number");
	    int p=Integer.parseInt(in.readLine());
	      int c=2;
	     int b=0;
	    for(int g=1; g<n; g++)
	    {
	    System.out.println("enter"+" "+c+" "+"number");
	    b=Integer.parseInt(in.readLine());
	    
	    
	    int i; int t=0;
	    for(  i=1; true; i++)
	    {
	        if(i%p==0 && i%b==0)
	        
	        {
	             t=i;
	            break;
	        }
	    }
	    p=t;
	    c++;
	}
	System.out.println(p);
	}
	}