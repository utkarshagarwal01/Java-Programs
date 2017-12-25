/**
  123454321
  1234 4321
  123   321
  12     21
  1       1
  12     21
  123   321
  1234 4321
  123454321
  */

public class P5
{
public void xyz()
{
int i,j,m,k,l,sp=-1;
for(i=5;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j);
}
for(k=1;k<=sp;k++)
{
System.out.print(" ");
}
if(i==5)
m=i-1;
else
m=i;
for(l=m;l>=1;l--)
{
System.out.print(l);
}
System.out.println();
sp=sp+2;
}
int a,b,c,d,e,space=5;
for(a=2;a<=5;a++)
{
for(b=1;b<=a;b++)
{
System.out.print(b);
}
for(d=1;d<=space;d++)
{
System.out.print(" ");
}
if(a==5)
c=a-1;
else
c=a;
for(e=c;e>=1;e--)
{
System.out.print(e);
}
System.out.println();
space=space-2;
}
}
}