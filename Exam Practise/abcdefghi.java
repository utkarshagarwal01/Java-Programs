/**
 *     1
 *    101
 *   10101
 *  1010101
 * 101010101
 */

public class abcdefghi
{
public void xyz()
{
int i,j,k,a,sp=4;
for(i=1;i<=5;i++)
{
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
for(j=i;j>=1;j--)
{
if((i+j)%2==0)
System.out.print("1");
else
System.out.print("0");
}
for(a=i-1;a>=1;a--)
{
System.out.print(a);
}
System.out.println();
sp--;
}
}
}