/**
 1       1
 12     21
 123   321
 1234 4321
 123454321
*/

public class P4
{
public void xyz()
{
int i,j,m,k,l,sp=7;
for(i=1;i<=5;i++)
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
sp=sp-2;
}
}
}