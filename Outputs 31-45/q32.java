class q32
{
public static void main()
{
int b=0;
int c[]={1,2,4,5,7,8,10,13,14,16};
for(int a=0;a<10;a++)
if((c[a]%2)==0)
b+=c[a];
System.out.println("The final result="+b);
}}