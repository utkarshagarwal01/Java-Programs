public class Exponent
{
double power(double b,int e)
{
if(e==0)
return 1;
if(e==1)
return b;
else
return b* power(b,--e);
}
void main (double base,int exp)
{
int flag=0;
{
if(exp<0)
{
exp=exp*-1;
flag=1;
}
double p=power(base,exp);
if(flag==1)
System.out.print(1/p);
else
System.out.print(p);
}
}}
