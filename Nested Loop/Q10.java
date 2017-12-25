/**
 *1
  01
  101
  0101
  10101
  */

public class Q10
{
public void xyz()
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
if((i+j)%2==0)
System.out.print(1);
else
System.out.print(0);
}
System.out.println();
}
}
}
