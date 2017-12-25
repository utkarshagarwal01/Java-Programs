 /**
 * Input two nos. and calculate the HCF.
 */
public class hcf
{
public void xyz(int a,int b)
{
int i,h=1;
for(i=1;i<=a;i=i+1)
{
if(a%i==0&&b%i==0)
{
h=i;
}
}
System.out.println("HCF ="+h);
}
}