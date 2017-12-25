public class abcde
{
public void xyz(int n,double x)
{
double s=0.0; int i,c=1,p=1,j,t=1,k=2;
for(i=1;c<=n;i=i+2)
{
double q=(int) Math.pow(x,i);
for(j=1;j<=k;j++)
{
t=t*j;
}
if(c%2==0)
{
s=s-q/t;
}
else
{
s=s+q/t;
}
c++;
k=k+2;
}
System.out.print(s);
}
} 