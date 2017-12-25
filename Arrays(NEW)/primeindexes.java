/**
 * Input Nos in the array and print the nos in prime indexes.
 */
class primeindexes
{
void xyz(int a[])
{
int n=a.length;
int i,j,c=0;
for(i=1;i<n;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==2)
{
System.out.println(a[i]);
}}}}