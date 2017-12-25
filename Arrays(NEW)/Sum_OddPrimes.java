class Sum_OddPrimes
{
int i,j,c=0;
void xyz(int n)
{
if(n<=4||n%2!=0)
System.exit(0);
else 
{
for(i=3;i<n/2;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
int d=0;int x=n-i;
for(j=1;j<=x;j++)
{
if(x%j==0)
d++;
}
if(c==2&&d==2)
{
System.out.println(i+","+x);
}
}
}
}
}
