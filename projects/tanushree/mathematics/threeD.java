
import java.io.*;
public class threeD
{
	BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
	double  vol; double csa; double tsa;
	void cube() throws IOException
	{
        System.out.println("Enter edge");
        double d=Double.parseDouble(in.readLine());
        vol=d*d*d;
        tsa=6*d*d;
        
        System.out.println("volume="+vol);
        System.out.println(" Total Surface Area="+tsa);
        
    }
    void cuboid() throws IOException
    {
        System.out.println("Enter length");
        double l=Double.parseDouble(in.readLine());
        System.out.println("Enter breadth");
        double b=Double.parseDouble(in.readLine());
        System.out.println("Enter height");
        double h=Double.parseDouble(in.readLine());
        vol=l*b*h;
        tsa=2*((l*b)+(b*h)+(h*l));
        
        System.out.println("volume="+vol);
        System.out.println("Total Surface Area="+tsa);
        
    }
    void cone() throws IOException
    
    {   double r;
        double l;
        double h;
        System.out.println("In case you dont know the asked value type null");
        System.out.println("Enter lateral heigth");
        String L=in.readLine();
        System.out.println("Enter radius of the base");
        String R=in.readLine();
        System.out.println("Enter heigth");
        String H=in.readLine();
        if(L.equalsIgnoreCase("null"))
        {
             r=Double.parseDouble(R);
             h=Double.parseDouble(H);
             l=Math.sqrt((r*r)+(h*h));
         }
         else if(R.equalsIgnoreCase("null"))
         {
             h=Double.parseDouble(H);
             l=Double.parseDouble(L);
             r=Math.sqrt((l*l)-(h*h));
         }
         else if(H.equalsIgnoreCase("null"))
         {
             l=Double.parseDouble(L);
             r=Double.parseDouble(R);
             h=Math.sqrt((l*l)-(r*r));
         }
         else
         {
             r=Double.parseDouble(R);
             h=Double.parseDouble(H);
             l=Double.parseDouble(L);
         }
          vol=(22/(double)21)*r*r*h;
          csa=(22/(double)7)*r*l;
          tsa=csa+(22/7)*r*r;
          System.out.println("volume="+vol);
          System.out.println("Surface Area="+csa);
          System.out.println("Total Surface Area="+tsa);
          
          
      }
      
      void sphere() throws IOException
      {
          System.out.println("Enter radius");
          double r=Double.parseDouble(in.readLine());
          tsa=4*(22/7)*r*r;
          vol=(4/3)*(22/7)*r*r*r;
          System.out.println("volume="+vol);
          System.out.println("Total Surface Area="+tsa);
      }
      void spherical_shell() throws IOException
      {
           System.out.println("Enter Outer radius");
           double R=Double.parseDouble(in.readLine());
           System.out.println("Enter Inner radius");
           double r=Double.parseDouble(in.readLine());
            tsa=4*(22/7)*R*R*R;
            vol=(4/3)*(22/7)*((R*R*R)-(r*r*r));
            System.out.println("volume of material="+vol);
          System.out.println("Total Surface Area="+tsa);
      }
      void hemisphere() throws IOException
      {
          System.out.println("Enter radius");
          double r=Double.parseDouble(in.readLine());
          csa=2*(22/7)*r*r;
          vol=(2/3)*(22/7)*r*r*r;
          tsa=3*(22/7)*r*r;
       System.out.println("volume="+vol);
       System.out.println("Curved Surface Area="+csa);
       System.out.println("Total Surface Area="+tsa);
      
      }
      void hemispherical_shell() throws IOException
      {
           System.out.println("Enter Outer radius");
           double R=Double.parseDouble(in.readLine());
           System.out.println("Enter Inner radius");
           double r=Double.parseDouble(in.readLine());
            tsa=(22/7)*((3*R*R)+(r*r));
            vol=(2/3)*(22/7)*((R*R*R)-(r*r*r));
             double incsa=2*(22/7)*r*r;
             csa=2*(22/7)*R*R;
              System.out.println("volume="+vol);
              System.out.println("Internal Curved Surface Area="+incsa);
              System.out.println("External Curved Surface Area="+csa);
              System.out.println("Total Surface Area="+tsa);
  }
}
          
          
          
      
             
             
        
        
    
        