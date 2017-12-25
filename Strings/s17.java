public class s17
{
public void xyz(String d)
{
int t=d.length();
for(int i=0;i<t;i++)
{
char x=d.charAt(i);
int y=(int)x;
if(y>=65 && y<=86)
{
y=y+4;
System.out.println((char)y);
}
else if(y>=87)
{
y=y-22;
System.out.println((char)y);
}
}
}
}