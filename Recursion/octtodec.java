public class octtodec
{
int s;
int odec(int n,int i)
{
if(n!=0)
return (int)Math.pow(8,i)*(n%10)+odec(n/10,++i);
else
return 0;
}
public void main(int n)
{
s=odec(n,0);
System.out.print(s);
}
}

