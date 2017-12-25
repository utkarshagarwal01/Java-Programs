public class dectobin
{
int s;
int db(int n,int i)
{
if(n!=0)
return (int)Math.pow(10,i)*(n%2)+db(n/2,++i);
else
return 0;
}
public void main(int n)
{
s=db(n,0);
System.out.print(s);
}
}

