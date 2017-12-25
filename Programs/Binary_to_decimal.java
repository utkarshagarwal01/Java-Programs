public class Binary_to_decimal 
{
public void xyz(int n)
{
int x=n;
int a,s=0,p=0,i=0;
while(n!=0)
{
a=n%10;
p=(int)Math.pow(2,i);
s=s+(a*p);
i++;
n=n/10;
}
System.out.println(s);
}
}