/**
  123454321
  1234 4321
  123   321
  12     21
  1       1
*/

public class P3
{
public void xyz()
{
int i,j,m,k,l,sp=-1;
for(i=5;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
if(i==5)
m=i-1;
else
m=i;
for(l=m;l>=1;l--)
{
System.out.print(l);
}
System.out.println();
sp=sp+2;
}
}
}