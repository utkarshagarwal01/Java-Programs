public class Tribonacci
{
int tri(int n)
{
if(n==1)
return 0;
else
if(n==2)
return 1;
else
if(n==3)
return 2;
else
return tri(n-1)+tri(n-2)+tri(n-3);
}
void main(int n)
{
for(int i=1;i<=n;i++)
{
int t=tri(i);
System.out.print(t+",");
}
}
}
