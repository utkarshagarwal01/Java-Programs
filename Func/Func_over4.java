public class Func_over4
{
public void polygon()
{
int i,j;
for(i=1;i<=3;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
public void polygon(int x,char y)
{
int i,j;
for(i=1;i<=x;i++)
{
for(j=1;j<=x;j++)
{
System.out.print((char)y);
}
System.out.println();
}
}
public void polygon(int x,int y)
{
int i,j;
for(i=1;i<=x;i++)
{
for(j=1;j<=y;j++)
{
System.out.print("?");
}
System.out.println();
}
}
}