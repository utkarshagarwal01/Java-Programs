class string
{
void sss(String str)
{
str=str+" ";
int t=str.length();
int i;String s1="";
String a[]=new String[t];
int k=0;
for(i=0;i<t;i++)
{
char x=str.charAt(i);
if(x!=' ')
{
s1=s1+x;
}
else
{
a[k]=s1;
k++;
s1="";
}
}
for(i=0;i<(k-1);i++)
{
for(int j=i+1;j<k;j++)
{
if(a[i].length()> a[j].length())
{
String temp=a[i];
a[i]=a[j];
a[j]=temp;
}
else if(a[i].length()==a[j].length())
{
if(a[i].compareTo(a[j])>0)
{
String temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
}
for(i=0;i<k;i++)
{
System.out.print(a[i]+" ");
}
}
}