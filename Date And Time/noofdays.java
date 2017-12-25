class noofdays
{
void main(int dd1, int dd2, String m1, String m2, int yy1, int yy2)
{
int i;
int c=0;
int ww=days(dd1,m1,yy1);
c=c+ww;
int xx=days(dd2,m2,yy2);
c=c+(365-xx);
int plus=0,leapo=0;
for(i=yy1+1;i<yy2;i++)
{
plus++;
if(i%100==0)
{
if(i%400==0)
{
leapo++;
}
else
{}
}
else if(i%4==0)
{
leapo++;
}
else
{
}
}
System.out.println(c+(365*plus)+leapo);
}
public int days(int dd, String mm, int yy)
{
int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String m[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
int i;
int mmn=0;
int dayz=0;
if(yy%100==0)
{
if(yy%400==0)
{
a[2]++;
}
else
{}
}
else if(yy%4==0)
{
a[2]++;
}
else
{
}

for(i=1;i<=12;i++)
{
if(mm.equals(m[i]))
{
mmn=i;
}
}
for(i=1;i<=(mmn-1);i++)
{
dayz=dayz+a[i];
}
dayz=dayz+dd;
return dayz;
}
}