/**
 *    5
     54
    543
   5432
  54321
  */

public class Question4
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
for(j=5;j>=i;j--)
{
System.out.print(j);
}
System.out.println();
sp--;
}
}
}