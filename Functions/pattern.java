public class pattern
{
public void dg()
{
int i,j,a;

for(i=86;i<=90;i++)
{
if(i%2==0)
{
for(j=90;j>=i;j--)
{
System.out.print((char)j);
}
}
else
{
for(a=86-41;a<=90-41+i;i++)
{
System.out.print((char)a);
}
}
}
}
}