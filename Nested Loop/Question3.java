/**
 *    5
     45
    345
   2345
  12345
  */

public class Question3
{
public void xyz()
{
int i,j,k,sp=4;
for(i=5;i>=1;i--)
{
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=i;j<=5;j++)
{
System.out.print(j);
}
System.out.println();
sp--;
}
}
}