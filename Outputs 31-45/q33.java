class q33
{
void main()
{
int r;
for(int i=0;i<5;i++)
{
r=recs(i);
System.out.println(i+"\t"+r);
}
}
public int recs(int num)
{
if(num==0)
return 0;
else
return(num +recs(num-1));
}
}