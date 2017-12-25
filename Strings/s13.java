/*
* To check whether the inputted string is a palindrome or not.
*/
public class s13
{
void xyz(String s)
{
int t=s.length();
int i;String s1="";
for(i=t-1;i>=0;i--)
{
char x=s.charAt(i);
s1=s1+x;
}
if(s1.equalsIgnoreCase(s))
{
System.out.print("palindrome");
}
else
{
System.out.print(" not a palindrome");
}
}
}