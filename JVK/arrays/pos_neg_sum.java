class pos_neg_sum
{
void ijkh(int a[])
{
int t=a.length;
int i,negative=0,positive=0;
for(i=0;i<t;i++)
{
if(a[i]>0)
positive=positive+a[i];
else 
negative=negative+a[i];
}
System.out.println(positive);
System.out.println(negative);
}
}