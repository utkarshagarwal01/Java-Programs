public class HCF
{
void hcf(int a,int b,int i)
{
if(a%i==0&&b%i==0)
{
System.out.print("HCF="+i);
return ;
}
else
{
hcf(a,b,--i);
}
}
public void main(int x,int y)
{
hcf(x,y,x);
}
}

