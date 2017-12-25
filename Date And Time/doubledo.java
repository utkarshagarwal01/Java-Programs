class doubledo
{
void main(int n, int y, String day)
{
String week[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
if(y%100==0)
{
if(y%400==0)
{
a[2]++;
}
else
{}
}
else  if(y%4==0)
{
a[2]++;
}
else
{}
int x=n;
int i=0;
while(n>0)
{
i++;
n=n-a[i];
}

int wek=0;
int k;
for(k=1;k<=7;k++)
{
if(day.equals(week[k]))
{
wek=k;
}
}
int p=x%7;
if(p>7)
{
p=(7-p);
}
if(n==0)
{
System.out.println("date"+""+"1");
}
else if(n>0)
{
System.out.println("date"+" "+(n+1));
}
else
{
System.out.print("date"+" "+(a[i]+(n+1)));
}
System.out.println("month"+""+i);
System.out.println("day"+""+week[p]);
}
}





