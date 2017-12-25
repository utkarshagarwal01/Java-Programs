/**
 *Input a no. and print the sum of the digits. 
 */
public class digits1
{
public void xyz(int n)
{
int a,s=0;
int x=n;
while(n!=0)
{
a=n%10;
s=s+a;
n=n/10;
}
System.out.println(s);
}
}
