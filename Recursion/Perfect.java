public class Perfect
{
int per(int n,int s,int i)
{
if(n==s)
return 1;
if(n<s)
return 0;
else
if(n%i==0)
return per(n,s+i,++i);
else
return per(n,s,++i);
}
void main (int n)
{
if (per(n,0,1)==1)
System.out.print("Perfect");
else
System.out.print("Not Perfect");
}}