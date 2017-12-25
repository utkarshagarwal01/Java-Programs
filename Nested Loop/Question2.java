/**
 *    1
     21
    321
   4321
  54321
  */

public class Question2
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
for(j=i;j>=1;j--)
{
System.out.print(j);
}
System.out.println();
sp--;
}
}
}