import java.io.*;
/*THE SQUARE ROOT IN THIS PROGRAMME IS
 * CALCULATED BY LONG DIVISION METHOD*/
public class squareroot
{
	double cal(double n)
	{
	    int a=0,i1=0;
	    double i2;
	   if(n>0)
	   {
	   for(i2=1;i2<=n;i2++)
	   {                            //CALCULATING ROOTS OF PERFECT SQUARES
	       if(i2*i2==n)
	       {
	           return(i2) ;
	       }
	   }
	       while((n*10)%10!=0)      //METHOD FOR CONVERTING NUMBER INTO WHOLE NUMBER
		{
		    if(a==4)
		    break;
		    a=a+1;
		    n=n*10;
		}
		long rn=0;
		while(rn<n)               //GETING COPY OF NUMBER AS INTEGER
		{
		    rn++;
		}
		 long nu=rn;
		while(nu!=0)
		{
		    i1++;
		    nu=nu/10;
		}
		rn=rn*100000000;            //FOR GETTING ROOT TO 3 DECIMEL PLACE IT IS MULTIPLIED BY 10^6
		long a1[]=new long[100];  
		long a2[]=new long[100];
		int l=-1,i=0;
		long ti;
		long x,k,s=0,d=0,c=0,rn1=rn,t,s1=0;
		while(rn1!=0)
		{
		    l++;                      //STORING NUMBER INTO ARRAY
		    x=rn1%10;
		    a1[l]=x;
		    rn1/=10;
		} 
		int l1=l;
		for(i=0;i<l;i++)
		{
		    a2[i]=a1[l1];
		    l1--;
		}
		a2[i+1]=-1;          //GETTING LAST ELEMENT AS -1 SO THT LOOP CAN BE EXTTED BY IT
		i=0;
		int col=0;
		double sum=0;
		 while(a2[i]!=-1)
		    {
		        
		        t=0;
		        c=0;
		        if(i1%2!=0&&i==0)
		        {                             //METHODS FOR GEETING PAIRS OR SINGLE NUMBER FOR CARRYING ON OPERATION
		          t=a2[i];
		          i++;
		        }
		        else
		        {
		             t=((a2[i])*10)+a2[i+1];  
		             i=i+2;
		        }
		        t+=d;
		        if(t/10<s)                     //IF REMAINDER IS LESSER THAN DIVISOR
		        {
		            col++;
		            s=s*10;
		            t=t*100;
		            sum*=10;
		        }
		        for(k=1;k<=9;k++)
		        {                              
		           if((s*10+k)*k<=t)
		           c=k;
		        }
		        d=t-((s*10+c)*c);
		        s=(s*10+c)+c;
		        d=d*100;
		        sum=sum*10+c;
		   }
		    long j;
		   for(j=1;j<=4+col+(a/2);j++)       //FOR GETTING THE ROOT CORRET TO CORRECT PLACES OF DECIMAL
		   sum/=10;
		   return sum; 
		}return-1;
	}
	public void main(String args[])throws IOException
   {
      BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
      double n1,n;
      int t=1,loop=0,choice1;
       while(t==1)
	    {
	        if(loop>0)
	    System.out.println( );
	    if(loop==0)
	    System.out.println("ENTER A NUMBER");
	    else
	    System.out.println("ENTER ANOTHER NUMBER");
	    loop++;
	    String s1=ob.readLine();
        n=Double.parseDouble(s1);
        n1=n;
        n=cal(n);
        if(n<=0)
	    System.out.println("INVALID INPUT FOR FUNCTION");
	    else
	    {
		System.out.println("THE SQUARE ROOT OF "+n1+" IS "+n+"  (NEAREST TO 4 DECIMAL PLACE)");
		}
		System.out.println( );
		System.out.println("DO YOU WANT TO CONTINUE ");      //LOOP TO CONTINUE
		System.out.println("ENTER 1 FOR YES");
		System.out.println("ENTER 0 FOR NO");
		String s3=ob.readLine();
	    choice1=Integer.parseInt(s3);
	    if(choice1==1)
	    t=1;
	    else
	    t=0;
	    if(t==0)
	    {
	        System.out.println();
	    System.out.print("<-----------------------------------------------THANK YOU----------------------------------------------------->");
	    }
	}   
   }
}