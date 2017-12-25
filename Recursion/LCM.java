public class LCM
{
void lcmm(int a,int b,int i)
{
if(i%a==0&&i%b==0)
{
System.out.print("LCM="+i);
return ;
}
else
{
lcmm(a,b,++i);
}
}
public void main(int x,int y)
{
lcmm(x,y,x);
}
}

