public class SumDigit
{
public int Digit(int n)
{
if(n!=0)
{
return n%10 +Digit(n/10);
}
else
{
return 0;
}
}
void main(int n)
{
int s=Digit(n);
System.out.println(s);
}
}
