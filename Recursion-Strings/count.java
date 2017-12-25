public class count
{
int t;
int u=0,l=0,d=0,v=0,w=0,sp=0;
public void count(String str,int i)
{
t=str.length();
if(i<t)
{
char x=str.charAt(i);
if(Character.isUpperCase(x))
u++;
if(Character.isLowerCase(x))
l++;
if(Character.isDigit(x))
d++;
if(Character.isWhitespace(x))
sp++;
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
v++;
count(str,++i);
}else{
System.out.println("Uppercase Characters = "+u+"\n"+"Lowercase Characters = "+l+"\n"+"Digits = "+d+"\n"+"vowels = "+v+"\n"+"Spaces = "+sp);
}
}
public void main(String str)
{
str=str+" ";
t=str.length();
count(str,0);
}
}

