/**
 *    1
     121
    12321
   1234321
  123454321
 */

public class P1
{
public void xyz()
{
int i,j,k,l,sp=4;
for(i=1;i<=5;i++)
{
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(l=i-1;l>=1;l--)
{
System.out.print(l);
}
System.out.println();
sp--;
}
}
 }