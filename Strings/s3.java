/*
 *To print no. of uppercase,lowercase,digits,vowels,spaces and no. of words. 
 */
public class s3
{
void xyz(String s)
{
int i,up=0,lc=0,d=0,v=0,sp=0,w=0;
int t=s.length();
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x>='A'&&x<='Z')
{
up++;
}
if(x>='a'&&x<='z')
{
lc++;
}
if(x>='0'&&x<='9')
{
d++;
}
if(x=='a'|x=='A'|x=='e'|x=='o'|x=='i'|x=='u'|x=='E'|x=='I'|x=='U')
{
v++;
}
if(x==' ')
{
sp++;
}
w=sp+1;
System.out.print(up);
System.out.print(lc);
System.out.print(d);
System.out.print(v);
System.out.print(sp);
System.out.print(w);
}
}
}
