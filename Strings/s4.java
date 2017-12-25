/*
 * 
To print Raja Ram Mohan Roy as R R M R
 */
public class s4
{
void xyz(String s)
{
int i;
int t=s.length();
s=" "+s;
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x==' ')
{
System.out.print(s.charAt(i+1));
}
}
}
}

