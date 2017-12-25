public class bintodec
{
int s;
int db(int n,int i)
{
if(n!=0)
return (int)Math.pow(2,i)*(n%10)+db(n/10,++i);
else
return 0;
}
public void main(int n)
{
s=db(n,0);
System.out.print(s);
}
}

