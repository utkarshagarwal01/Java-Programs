class DMV implements Runnable
{
    int i;
    Thread t;
    DMV()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        for(int j=0;j<4;j++)    
            {
                do1();
                do2();
            }
    }
    void do1()
    {
        try{
            Thread.sleep(1000);
    }
    catch(Exception e)
    {System.out.print("do1e");}
}
 synchronized  void do2()
    {
        try{
            Thread.sleep(1000);
    }
    catch(Exception e)
    {System.out.print("do2e");}
}
}
public class DMVTest
{
public static void main(String args[])
{
DMV d1=new DMV();
DMV d2=new DMV();
try{
d1.t.join();
d2.t.join();
}
catch(Exception e)
    {System.out.print("main");}
    System.out.print("Fin");
}}