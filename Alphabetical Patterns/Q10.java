/**
 *    A
     BA
    CBA
   DCBA
  EDCBA
 */

public class Q10
{
public void xyz()
{
int i,j,k,sp=4;
for(i=65;i<=69;i++)
{
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=i;j>=65;j--)
{
System.out.print((char)j);
}
System.out.println();
sp--;
}
}
}
