import java.io.*;
public class data
{   BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	String[][] input(int n,int s, String m,int aa[],double balance[]) throws IOException
	{   double bal2; double with; double dep; 
	    String dataValues1[][]=new String[n][s];
         String choice="";
	    int c=1;
	    System.out.println("please enter your balance from last month if any, if not enter 0");
	   
	    String bal=in.readLine();
	    bal2=Double.parseDouble(bal);
	    
	    balance[0]=bal2;
	    dataValues1[0][s-1]=bal;
	    for(int i=0; i<n; i++)
        {
       for (int j=0; j<s-1; j++)
           {   
               
if(j==0) 
{
System.out.println("Enter date, as month date eg. january 21");
}
else if(j==1)
{
System.out.println("Enter particulars");
}
else if(j==2)
{
System.out.println("Enter Withdrawls");
}
else if(j==3)
{
System.out.println("Enter Deposits");
}

dataValues1[i][j]=in.readLine(); 
}
  
 dep=Double.parseDouble(dataValues1[i][3]);
   with=Double.parseDouble(dataValues1[i][2]);
   bal2=bal2+dep-with;
   if(bal2<0)
   {
       System.out.println("Your withdrawl exceeds yout balance");
       
       break;
   }
   bal=Double.toString(bal2);
   dataValues1[i][s-1]=bal;
   System.out.println("If finished type last entry, else input next entry");
   choice=in.readLine();
   if(choice.equalsIgnoreCase("next entry"))
   {    c++;
       continue;
   }
   else
   {   break;
       
   }
  
}
aa[0]=c;
 return (dataValues1);

}

}

