/*
 * Input a sting and print the smallest word.
 */
public class s12
{
void xyz(String s)
{
s=s+" ";
int t=s.length();
int min=100000;
int i;String s1="",s2="";
for(i=0;i<t;i++)
{
char x=s.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
if(s1.length()<=min)
{
min=s1.length();
s2=s1;}
s1="";
}
}
System.out.print(s2);
}    
}
