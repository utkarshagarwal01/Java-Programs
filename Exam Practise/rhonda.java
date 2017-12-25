public class rhonda
{
public void xyz(int p,int q)
{
int n;
for(n=p;n<=q;n++)
{
int f=1,i;
int x=n;
int a=0;
int y=n;
while (y!=0)
{
a=y%10;
f=f*a;
y=y/10;
}
i=2;int s=0;
while(x!=1)
{
if(x%i==0)
{
x=x/i;
s=s+i;
}
else
i++;
}
if((s*10)==f)
System.out.println("Rhonda Number" + n);

}
}}