
import java.io.*;
public  class class1 
{
	void main1() throws IOException
	{
	    BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	    while (true)
	    {
	        System.out.println("MENU");
	        System.out.println("press 1 for Pure Arthematics");
	        System.out.println("press 2 for Algebra");
	        System.out.println("press 3 for Coordinate geometry");
	        System.out.println("press 4 for Mensuration");
	        System.out.println("press 5 to Exit");
	        System.out.println("Please enter your choice");
	        int ch=Integer.parseInt(in.readLine());
	        int ch5=0;
	        int a=0;
	        int b=0;
	        int c=0;
	        switch(ch)
	        {
	            case 1:
	            System.out.println("Welcome to Pure Arthematic");
	            System.out.println("press 1 for Simple Interest");
	            System.out.println("press 2 for Compound Interest");
	            System.out.println("press 3 for Sales Tax");
	            System.out.println("press 4 for Banking");
	            System.out.println("press 5 to go to previous menu");
	            System.out.println("press 6 to exit");
	            System.out.println("Please Enter  your choice");
	            int ch1=Integer.parseInt(in.readLine());
	            switch (ch1)
	            {
	                case 1:
	                System.out.println("What do u wish to calculate: Interest, Amount, rate, Principal, Time");
	                String choice=in.readLine();
	                simple object=new simple();
	                if(choice.equalsIgnoreCase("Interest"))
	                {
	                    object.interest();
	                }
	                 else if(choice.equalsIgnoreCase("Amount"))
	                {
	                    object.amount();
	                }
	                  else if(choice.equalsIgnoreCase("rate"))
	                {
	                    object.rate();
	                }
	                   else  if(choice.equalsIgnoreCase(" Principal"))
	                {
	                    object. principal();
	                }
	                  else  if(choice.equalsIgnoreCase("Time"))
	                {
	                    object.time();
	                }
	                else
	                {
	                    System.out.println("Wrong choice");
	                    
	                }
	                break;
	                
	                case 2: 
	                 System.out.println("What do u wish to calculate: Interest, Amount, rate, Principal, Time");
	                String choice3=in.readLine();
	                annuallycompound object2=new annuallycompound();
	                if(choice3.equalsIgnoreCase("Interest"))
	                {
	                    object2.interest();
	                }
	                 else if(choice3.equalsIgnoreCase("Amount"))
	                {
	                    object2.amount();
	                }
	                  else if(choice3.equalsIgnoreCase("rate"))
	                {
	                    object2.rate();
	                }
	                   else  if(choice3.equalsIgnoreCase(" Principal"))
	                {
	                    object2. principal();
	                }
	                  else  if(choice3.equalsIgnoreCase("Time"))
	                {
	                    object2.time();
	                }
	                else
	                {
	                    System.out.println("Wrong choice");
	                    
	                }
	                break;
	                
	                case 3:
	                sales_tax st=new sales_tax();
	                st.salestax();
	                break;
	                
	                case 4:
	                System.out.println("press 1 for savings Bank Account");
	                System.out.println("press 2 for recurring Bank Account");
	                int choice1=Integer.parseInt(in.readLine());
	                if(choice1==1)
	                {
	                    data2 ob1=new data2();
	                     ob1.main();
	                    
	                    
	                }
	                else if(choice1==2)
	                {
	                    recurring ob2=new recurring();
	                    ob2.rec();
	                    
	                }
	                else
	                {
	                    System.out.print("wrong choice");
	                }
	                break;
	                    
	                
	                case 5:break;
	                case 6:System.exit(0);
	            }
	            
	                break;
	            
	            
	            case 2:
	            System.out.println("Welcome to Algebra");
	            System.out.println("press 1 for Linear equations");
	            System.out.println("press 2 for simultaneous equation");
	            System.out.println("press 3 for Quadratic Equations");
	            System.out.println("press 4 for HCF and LCM");
	            System.out.println("press 5 for matrices");
	            System.out.println("press 6 to go to previous menu");
	            System.out.println("press 7 to exit");
	            System.out.println("Please Enter  your choice");
	            int ch2=Integer.parseInt(in.readLine());
	            switch (ch2)
	            {
	                
	                case 1:
	                equations ob=new equations();
	                ob.linear();
	                break;
	              
	              case 2:
	                equations ob2=new equations();
	                ob2.simultaneous();
	                break;
	                
	                case 3:
	                quadratic ob3=new  quadratic();
	                ob3.quad();
	                break;
	                
	                case 4:
	                System.out.println("enter HCF for HCF");
	                System.out.println("enter LCM for LCM");
	                String sf=in.readLine();
	                if("hcf".equalsIgnoreCase(sf))
	                  {
	                     HCF ob4=new HCF();
	                     ob4.fact();
	                   }
	                        
	             
	                if("lcm".equalsIgnoreCase(sf))
	                {
	                    LCM ob5=new LCM();
	                    ob5.multi();
	                 }  
	                   break;
	                  
	                
	                case 5:
	                System.out.println("enter add to add matrices");
	                System.out.println("enter sub to subtract matrices");
	                System.out.println("enter multi to multiply");
	                System.out.println("enter trans to transpose");
	                System.out.println("enter your choice");
	                String sd=in.readLine();
	                
	                    
	                if(sd.equalsIgnoreCase("add"))
	                     {  System.out.println("how many matrices do u wish to add");
	                        int n=Integer.parseInt(in.readLine());
	                       System.out.println("enter number of rows");
                            int r=Integer.parseInt(in.readLine());
	                       System.out.println("enter number of columns");
	                       int col=Integer.parseInt(in.readLine());
	                         input_matrix m=new input_matrix(); 
	                         int res[][]=new int [r][col];
	                         res=m.add(n,r,col);
	                         System.out.println("The result is ------->");
	                         m.disp(res);
	                     }
	                    if(sd.equalsIgnoreCase("sub")) 
	                    {
	                        System.out.println("how many matrices do u wish to sub");
	                        int n=Integer.parseInt(in.readLine());
	                       System.out.println("enter number of rows");
                            int r=Integer.parseInt(in.readLine());
	                       System.out.println("enter number of columns");
	                       int col=Integer.parseInt(in.readLine());
	                         input_matrix m=new input_matrix(); 
	                         int res[][]=new int [r][col];
	                         res=m.add(n,r,col);
	                         System.out.println("The result is ------->");
	                         m.disp(res);
	                        
	                 }   
	                        
	                    if(sd.equalsIgnoreCase("multi"))
	                    {    
	                        input_matrix m=new input_matrix();
	                         System.out.println("how many matrices do u wish to Multiply");
	                        int n=Integer.parseInt(in.readLine());
	                        
	                       System.out.println("enter number of rows for 1st matirx");
                            int r=Integer.parseInt(in.readLine());
	                       System.out.println("enter number of columns for 1st matrix");
	                       int col=Integer.parseInt(in.readLine());
	                       int mat1[][]=new int[r][col];
	                       mat1=m.inp(r,col);
	                       System.out.println("The result is ------->");
	                       m.multiply(mat1,n);

	                    }
	                    
	                    if(sd.equalsIgnoreCase("trans"))
	                    
	                    {   
	                         input_matrix m= new input_matrix();
	                        System.out.println("enter number of rows");
                            int r=Integer.parseInt(in.readLine());
	                       System.out.println("enter number of columns");
	                       int col=Integer.parseInt(in.readLine());
	                       int mat2[][]=new int[col][r];

	                       int mat1[][]=new int[r][col];
	                       mat1=m.inp(r,col);
	                       m.disp(mat1);
	                       mat2=m.transpose(mat1);
	                       System.out.println("The result is ------->");
  	                       m.disp(mat2);
	                 
                         }
	                    break;
	                        
	                            
	                case 6:break;
	                case 7: System.exit(0);
	                
	            }
	            
	                break;
	            
	            case 3:
	            System.out.println("Welcome to coordinate geometry");
	            System.out.println("press 1 for distance and section formulae");
	            System.out.println("press 2 for reflection");
	            System.out.println("press 3 to go to previous menu");
	            System.out.println("press 4 to exit");
	            System.out.println("Please Enter  your choice");
	            int ch3=Integer.parseInt(in.readLine());
	            switch (ch3)
	            {
	                 
	                case 1:
	                coordinate ob6=new coordinate();
	                System.out.println("Enter distance for distance formulae");
	                 System.out.println("Enter section for section formulae");
	                String gf=in.readLine();
	                if(gf.equalsIgnoreCase("distance"))
	                {
	               ob6.distance();
	                }
	                if(gf.equalsIgnoreCase("section"))
	                {
	                  ob6.section();
	                }
	                
	                break;
	                
	                
	                
	                
	                case 2:
	                coordinate ob7=new coordinate();
	                ob7.reflection();
	                break;
	                
	                case 3:break;
	                case 4:System.exit(0);
	           }
	           
	                break;
	            
	            case 4:
	            System.out.println("Welcome to Mensuration");
	            while (true)
	            {
	            System.out.println("press 1 for plane2D figures");
	            System.out.println("press 2 for 3D figures");
	            System.out.println("press 3 to go to previous menu");
	            System.out.println("press 4 to exit");
	            System.out.println("Please Enter  your choice");
	            int ch4=Integer.parseInt(in.readLine());
	            switch (ch4)
	            {
	                 
	                case 1:
	                System.out.println("press 1 for rectangle");
	                System.out.println("press 2 for square");
	                System.out.println("press 3 for trapezium");
	                System.out.println("press 4 for triangles");
	                System.out.println("press 5 for circle");
	                System.out.println("press 6 to go to previous menu");
	                System.out.println("press 7 to exit");
	                ch5=Integer.parseInt(in.readLine());
	                switch (ch5)
	                {
	                case 1:
	                area ob8=new area();
	                ob8.rect();
	                break;
	                
	                case 2:
	                area ob9=new area();
	                ob9.square();
	                break;
	                
	                case 3:
	                area ob10=new area();
	                ob10.trapezium();
	                break;
	                
	                case 4:
	                area ob11=new area();
	                ob11.triangles();
	                break;
	                
	                case 5:
	                area ob12=new area();
	                ob12.circle();
	                break;
	                
	               
	                
	                case 6: break;
	                case 7:System.exit(0);
	                
	                }
	                if( ch5==7)
	                break;
	                    
	                case 2:
	                System.out.println("press 1 for cube");
	                System.out.println("press 2 for cuboid");
	                System.out.println("press 3 for cone");
	                System.out.println("press 4 for sphere");
	                System.out.println("press 5 for spherical shell");
	                System.out.println("press 6 for hemisphere");
	                System.out.println("press 7 for hemispherical shell");
	                System.out.println("press 8 to go to previous menu");
	                System.out.println("press 9 to exit");
	                int ch6=Integer.parseInt(in.readLine());
	                switch (ch6)
	                {
	                case 1: threeD ob13=new threeD();
	                         ob13.cube();
	                         break;
	                         
	                case 2:threeD ob14=new threeD();
	                ob14.cuboid();
	                break;
	                
	                case 3:threeD ob15=new threeD();
	                ob15.cone();
	                break;
	                
	                case 4:threeD ob16=new threeD();
	                ob16.sphere();
	                break;
	                
	                case 5:threeD ob17=new threeD();
	                ob17.spherical_shell();
	                break;
	                
	                case 6:threeD ob18=new threeD();
	                ob18.hemisphere();
	                break;
	                
	                case 7:threeD ob19=new threeD();
	                ob19.hemispherical_shell();
	                break;
	                
	                
	                case 8: break;
	                case 9:System.exit(0);
	                
	                }
	                if( ch6==7)
	                break;
	            
	                
	                case 3:break;
	                case 4:System.exit(0);
	            }
	                if(ch4==3)
	                break;
	            }
	            break;
	            
	            
	            
	            case 5:
	            System.exit(0);
	            
	            default:
	            System.out.print("wrong choice");
	            
	        }
	    }
	}
	}

	        
	        
	    
	                
	                
	            
	            
	            
	             
	            
	            
	        
	