/*
 * 
 *To print Raja Ram Mohan Roy as Roy Raja Ram Mohan.
 */
public class s7
{
void xyz(String s)
{
int i;
s=" "+s;
int t=s.length();
int a=s.lastIndexOf(" ");
System.out.print(s.substring(a+1));
System.out.print(s.substring(0,a));
}
}
