/**
 * Input Nos in the array and print the prime nos.
 */
class primenumbers
{
void xyz(int a[])
{
int n=a.length;
int i,j,c=0;
for(i=1;i<=n;i++)
{
c=0;
for(j=1;j<=a[i];j++)
{
if(a[i]%j==0)
c++;
}
if(c==2)
{
System.out.println(a[i]);
}}}}