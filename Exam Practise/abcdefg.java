public class abcdefg
{
public void xyz(int n,double x)
{
double s=0.0; 
int i,c=1,p=1,j;
int l=1;
for(i=1;p<=n;i=i+2)
{
double t=Math.pow(x,i);
for(j=1;j<=i+1;j++)
{
l=l*j;
}
if(c%2==0)
{
s=s-(t/l);
}
else
{
s=s+(t/l);
}
c++;
p++;
}
System.out.print(s);
}
} 