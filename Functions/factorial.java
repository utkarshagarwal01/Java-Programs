public class factorial
{
int fact(int n)
{
int i,f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
return f;
}
void sum(int n)
{
int s=0,i;
for(i=1;i<=n;i++)
{
int t=fact(i);
s=s+t;
}
System.out.print(s);
}
}