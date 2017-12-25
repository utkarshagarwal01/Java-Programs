class box
{
int l,w,h;
box(int ...x)
{
l=0;
w=0;
h=0;
}
double val()
{
return l*w*h;
}
}
public class boxwt extends box
{
double wt;
boxwt()
{

super();
wt=0;
}
public static void main(String args[])
{
box b=new boxwt();

}
}