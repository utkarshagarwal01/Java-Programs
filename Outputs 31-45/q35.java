class q35
{
void proFunction(int x,int y)
{
float r=1.0f;int ch=0;
if(y==0)
System.out.print( r);
if(y<0)
{
y=y*(-1);
ch=1;
}
for(int m=1;m<=y;m++)
r*=x;
if(ch==1)
r=1/r;
System.out.print( r);
}
}