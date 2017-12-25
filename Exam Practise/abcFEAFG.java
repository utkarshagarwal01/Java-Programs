public class abcFEAFG
{
void xyz()
{
int i,a,s=0,c=0;
for(i=1000;i<=9999;i++)
{
s=0;
int x=i;
int p=i;
while(p!=0)
{
a=p%10;
s=(s*10)+a;
p=p/10;
}
if(s==x)
{
System.out.println(s);
c++;
}
}
System.out.println(c);
}
}