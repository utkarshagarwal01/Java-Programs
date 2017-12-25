public class tribbonacci
{
public static void xyz(int n)
{
int i,a=0,b=1,c=1,d,p=4;
System.out.print(a+",");
System.out.print(b+",");
System.out.print(c);
for(i=1;p<=n;i++)
{
d=a+b+c;
System.out.print(","+d);
a=b;
b=c;
c=d;
p++;
}
}
}