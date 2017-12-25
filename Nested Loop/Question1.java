/**
 *    1
     12
    123
   1234
  12345
 */

public class Question1
{
public void xyz()
{
int i,j,k,sp=4;
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
System.out.println();
sp--;
}
}
}