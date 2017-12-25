public class fibbonacci
{
public static void xyz(int n)
{
int i,a=0,b=1,p=3,c;
System.out.print(a+",");
System.out.print(b);
for(i=1;p<=n;i++)
{
c=a+b;
System.out.print(","+c);
a=b;
b=c;
p++;
}
}
} 