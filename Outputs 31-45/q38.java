class q38
{
private int d,n;
public q38()
{
d=0;
n=0;
}
public void readData(int x)
{
n=x;
}
public int someprocess(int v)
{
if(v==0)
return 1;
else
return(v*someprocess(v-1));
}
public void someoutput()
{
for(int a=0;a<=n;a++)
{
d=someprocess(a);
System.out.println(a+"and \t"+d);
}
}
public static void main()
{
q38 text=new q38();
System.out.println("Result 1=");
text.readData(3);
text.someoutput();
System.out.println("Result 2=");
text.readData(5);
text.someoutput();
}
}