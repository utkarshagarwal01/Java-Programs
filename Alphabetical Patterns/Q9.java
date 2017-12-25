/**
 *    A
     AB
    ABC
   ABCD
  ABCDE
 */

public class Q9
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
for(j=65;j<=i;j++)
{
System.out.print((char)j);
}
System.out.println();
sp--;
}
}
}
