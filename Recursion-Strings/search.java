public class search
{
String s1="";
String w="";
int t;
int flag;
public void search(String str,int i)
{
if(i<t)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.equalsIgnoreCase(w))
{
flag=1;
}
s1="";
}
search(str,++i);
}
else
{
if(flag==1)
System.out.println("Word found "+w);
else
System.out.println("Word not found "+w);
}
}
public void main(String str,String word)
{
str=str+" ";
t=str.length();
w=word;
flag=0;
search(str,0);
}
}