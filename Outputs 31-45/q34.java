class q34
{
void main()
{
char text[]={'J','a','M','e','s',' ','B','O','n','D'};
for(int a=0;a<text.length;a++)
{
if(Character.isLowerCase(text[a]))
text[a]=Character.toUpperCase(text[a]);
else if(Character.isUpperCase(text[a]))
if(a%2==0)
text[a]=Character.toLowerCase(text[a]);
else
text[a]=text[a-1];
}
System.out.println(text);
}}