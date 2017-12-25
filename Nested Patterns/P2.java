/**
  123454321
   1234321
    12321
     121
      1
*/

public class P2
{
public void xyz()
{
int i,j,k,l,sp=0;
for(i=5;i>=1;i--)
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
sp++;
}
}
}