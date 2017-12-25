class oddprimes
{
public boolean prime(int nn)
{
int c=0;
for(int i=1;i<=nn;i++)
{
if(nn%i==0)
{
c++;
}
}
if(c==2)
{
return true;
}
else
{
return false;
}

}
public void main(int n)
{
int j;
int mid=(n-1)/2;


for(j=3;j<=mid;j++)
{
if(prime(n-j)==true && (prime(j)==true))
{
System.out.println(j+" "+(n-j));
}
}
}
}