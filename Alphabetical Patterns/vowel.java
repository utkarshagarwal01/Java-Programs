public class vowel
{
public void xyz(String str)
{
int t=str.length();int i;
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
{
int p=(int)x+1;
System.out.print((char)p);
}
else
{
System.out.print((char)x);
}
}
}
}
