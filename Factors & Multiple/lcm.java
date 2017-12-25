/**
 * Input two nos. and calculate the LCM.
 */
public class lcm
{
public void xyz(int a,int b)
{
int i,l=1;
for(i=1;i<=(a*b);i=i+1)
{
if(i%a==0&&i%b==0)
{
l=i;
break;
}
}
System.out.println("LCM = "+l);
}
}