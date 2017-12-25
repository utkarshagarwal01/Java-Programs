public class constructor
{
int x,y;
constructor()
{
x=0;
y=0;
}
constructor ob=new constructor();
constructor(int x1,int y1)
{
x=x1;
y=y1;
}
void swap()
{
int t=x;
x=y;
y=t;
System.out.print("X="+x+"& Y="+y);
}
}