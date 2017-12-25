public class wI13
{
public void xyz(int u)
{
double b,sur=1,tb;
if(u<=80)
{
b=60;
}
else if(u>80&&u<=140)
{
b=60+(u-80)*.60;
}
else if(u>140&&u<=200)
{
b=60+60*.60+(u-140)*.50;
}
else
{
b=60+60*.60+60*.50+(u-200)*.40;
}
if(u>300)
{
{
sur=b*.15;
}
if(sur >70)
{
sur=70;
}
}
tb=b+sur;
System.out.println("Total bill = "+tb);
}
}
