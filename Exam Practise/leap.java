class leap
{
void x(int a,int b)
{
int y;
for(y=a;y<=b;y++)
{
if(y%400==0 || y%100!=0 && y%4==0)
System.out.println(y);
}
}
}