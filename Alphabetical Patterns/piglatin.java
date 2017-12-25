public class piglatin
{
public void xyz(String str)
{
int t=str.length(),i,flag=0;
String s1=" ";
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.print(str.substring(i));
System.out.print(str.substring(0,i));
System.out.print("ay");
}
}
}


