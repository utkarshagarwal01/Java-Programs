
import java.io.*;
public class input_matrix
{   BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	 int[][] inp(int r, int c) throws IOException
    {
	        
	    
	     int x[][]=new int [r][c];
	      System.out.println("enter elements in the matrix");
	     for(int i=0; i<r; i++)
	     {
	         for(int j=0; j<c; j++)
	         {  
	             x[i][j]=Integer.parseInt(in.readLine());
	         }
	     }
	     return(x);
	 }
	 
	 int[][] add(int n, int r, int c) throws IOException
	 {
	     
	      int f[][]=new int[r][c];
	       int e[][]=new int[r][c];
	     int sum[][]=new int[r][c];
	     f=inp(r,c);
	     disp(f);
	     int sq=2;
	     while(n-1>0)
	     {   System.out.println("enter elements in "+sq+" matrix");
	         sq++;
	         e=inp(r,c);
	         disp(e);
	     for(int i=0; i<r; i++)
	     {
	         for(int j=0; j<c; j++)
	         {
	             sum[i][j]=f[i][j]+e[i][j];
	         }
	     }
	     n--;
	     f=sum;
	   }
	   return (f);
	}
	   
	 void disp(int a[][])
	 {
	     int r=a.length;
	     int c=a[0].length;
	     for(int i=0; i<r; i++)
	     {
	         for(int j=0; j<c; j++)
	         {
	             System.out.print(a[i][j]);
	         }
	         System.out.println();
	     }
	 }
	 
	int[][] sub(int n, int r, int c) throws IOException
	 {
	     
	      int f[][]=new int[r][c];
	       int e[][]=new int[r][c];
	     int diff[][]=new int[r][c];
	     f=inp(r,c);
	     disp(f);
	     int sq=2;
	     while(n-1>0)
	     {   System.out.println("enter elements in "+sq+" matrix");
	         sq++;
	         e=inp(r,c);
	         disp(e);
	     for(int i=0; i<r; i++)
	     {
	         for(int j=0; j<c; j++)
	         {
	             diff[i][j]=f[i][j]-e[i][j];
	         }
	     }
	     f=diff;
	     n--;
	   }
	   return (f);
	}
	
		void multiply(int a[][], int n) throws IOException
		{  int count=2;
		    int c1=0;
	         int r2=0;
	    while(n-1>0)
	    {   int r1=a.length;  
	         c1=a[0].length;
	        System.out.println("enter number of rows for "+count+"matrix");
		     r2=Integer.parseInt(in.readLine());
		    System.out.println("enter number of columns for "+count+"matrix");
		    count++;
		    int c2=Integer.parseInt(in.readLine());
	        int f[][]=new int[r2][c2];
	        f=inp(r2,c2);
	        if(c1!=r2)
	        {
	            System.out.println("the matrices are not compatible to be multiplied");
	        System.out.println("the number of columns in the first matrix should be equal to number of rows in the second matrix");
	        break;
	        }
	        else
	        {
	            int temp=0;int flag=0; int flag2=0;
	        int fin[][]=new int[r1][c2];
	        for(int i=0; i<r1; i++)
	        {   
	            for(int k=0; k<c2; k++)
	            {
	                temp=0;
	                for(int j=0; j<c2; j++)
	                {
	                  temp=temp+(a[i][j]*f[k][i]);
	                 }
	               fin[i][k]=temp;
	           }
	            
	        }
	        a=fin;
	         }
	         n--;
	     }
	    if(c1==r2)
	     disp(a);
	 }
	     
	
	
	 int[][] transpose(int p[][])throws IOException
	    {
	        int r=p.length;
	        int c=p[0].length;
	        int q[][]=new int [c][r];
	        for(int i=0; i<c; i++)
	        {
	            for(int j=0; j<r; j++)
	            {
	                q[i][j]=p[j][i];
	            }
	        }
	     return(q);
	 }
	}
	
	
	 
	
	             
	     
	 
	 
	 

	     
	