/**
 *1^2-2^2+3^2-4^2....n
 */
public class sum8
{
public void xyz(int n)
{
int i,s=0;
for(i=1;i<=n;i=i+1)
{
if(i%2==0)
{
s=s-(i*i);
}
else
{
s=s+(i*i);
}
}
System.out.println(s);
}
}