class test
{
void main()
{
int i,j;
int flag=0;
for(i=1;i<=4;i++)
{
flag++;
for(j=0;j<=3;j++)
{
flag++;
break;
}
}
System.out.println(flag);
}
}