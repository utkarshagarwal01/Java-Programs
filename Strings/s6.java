/* 
*To print Raja Ram Mohan Roy as Roy RRM.
*/


public class s6
{
public void xyz(String s)
{
s=" "+s;
int t=s.length();
int a=s.lastIndexOf(" ");
System.out.print(s.substring(a+1));
for(int i=0;i<a;i++)
{
char x=s.charAt(i);
if(x==' ')
{
System.out.print(s.charAt(i+1));
}
}
}
}
