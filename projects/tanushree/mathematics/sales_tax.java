import java.io.*;
public class sales_tax
{
	 BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	 void salestax() throws IOException
	 {
	     System.out.println("Enter tax to find sales tax");
	     System.out.println("Enter rate to find sales tax rate");
	     System.out.println("Enter totalSP to find Total selling price");
	     System.out.println("Enter SP to find original sellingPrice");
	     String ch=in.readLine();
	     
	     if(ch.equalsIgnoreCase("tax"))
	     {
	         System.out.println("Enter rate at which Sales Tax is calculated");
	         double stp=Double.parseDouble(in.readLine());
	          System.out.println("Enter Selling Price");
	          double sp=Double.parseDouble(in.readLine());
	          double st=(stp/100)*sp;
	          System.out.println("Rs"+st);
	      }
	       if(ch.equalsIgnoreCase("rate"))
	     {
	         System.out.println("Enter Sales Tax ");
	         double st=Double.parseDouble(in.readLine());
	          System.out.println("Enter Selling Price");
	          double sp=Double.parseDouble(in.readLine());
	          double r=(st/sp)*100;
	          System.out.println(r+"%");
	      }
	       if(ch.equalsIgnoreCase("totalSP"))
	     {
	         System.out.println("Enter rate at which Sales Tax is calculated");
	         double stp=Double.parseDouble(in.readLine());
	          System.out.println("Enter Selling Price");
	          double sp=Double.parseDouble(in.readLine());
	          double st=(stp/100)*sp;
	          double t=sp+st;
	          System.out.println("Rs"+t);
	      }
	       if(ch.equalsIgnoreCase("sp"))
	     {
	         System.out.println("Enter rate at which Sales Tax is calculated");
	         double stp=Double.parseDouble(in.readLine());
	          System.out.println("Enter Selling Price including Sales Tax");
	          double t=Double.parseDouble(in.readLine());
	          double sp=(t*100)/(stp+100);
	          System.out.println("RS"+sp);
	      }
	  }
	}