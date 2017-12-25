class series2
{
double power(double b,int e)
{
if(e==0)
return 1;
else if(e==1)
return b;
else
return b*power(b,e-1);
}
int fact(int n)
{
if(n<=1)
return 1;
else
return n*fact(n-1);
}
void s2(double x,int n)
{
double s=0.0,s1=1.0;
for(int i=1;i<=n;i++)
{
double p=power(x,i);
int f=fact (i);
if(i%2==0)
s=s-p/f;
else
s=s+p/f;
}
System.out.print(s);
}}
