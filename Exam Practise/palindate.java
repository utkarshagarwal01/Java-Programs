public class palindate
{
public int leap(int y)
{
if(y%400==0 || y%100!=0 && y%4==0)
return 1;
else
return 0;
}
public void xyz(int y)
{
int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
{
int x=y;
int s=0,i=0;
int l=y%100;
while(y!=0)
{
int a=y%10;
s=(s*10)+a;
y=y/10;
}
s=s-(s%100);
s=s/100;
int flag=0;
if(leap(x)==1)
m[2]++;
if(s>31||l%10==0)
System.out.print("No Palindrome");
else
{
for(i=1;i<=12;i++)
{
if((s<=m[i])&&((i>=1&&i<=9)||(i==11)))
{
System.out.println(s+"."+i+"."+l);
}
}
}
}
}
}
