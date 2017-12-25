/*
* To print Raja Ram Mohan Roy as R R M Roy
*/


public class s5
{
void xyz(String s)
{
s=" "+s;
int i,j=0;
int t=s.length();
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x==' ')
{
System.out.print(s.charAt(i+1));
j=i+2;
}
}
for(i=j;i<t;i++)
{
System.out.print(s.charAt(i));
}
}
}
