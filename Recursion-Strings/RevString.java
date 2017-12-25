class RevString 
{
int l;
String rev,str;
public String reverse(int i) 
{
if(i<l)
{
rev=str.charAt(i)+rev;
reverse(++i);
}
else
{
return rev;
}
}
public void main(String str)
{
int l =str.length();
String s=reverse(0);
System.out.print(s);
}
}
