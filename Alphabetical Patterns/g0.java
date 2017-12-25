/**
 *    A
     BA
    CBA
   DCBA
  EDCBA
 */

public class g0
{
public void xyz()
{
int i,j,k,sp=4;
for(i=1;i<=4;i++)
{
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print((char)65+" ");
}
System.out.println();
sp--;
}
int space=2;
for(int c=3;c>=1;c--)
{
for(int o=1;o<=space;o++)
{
System.out.print(" ");
}
for(j=1;j<=c;j++)
{
System.out.print((char)65+" ");
}
System.out.println();
space++;
}
}
}