public class dectooct
{
int s;
int doct(int n,int i)
{
if(n!=0)
return (int)Math.pow(10,i)*(n%8)+doct(n/8,++i);
else
return 0;
}
public void main(int n)
{
s=doct(n,0);
System.out.print(s);
}
}

