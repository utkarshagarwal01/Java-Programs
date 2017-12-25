import java.util.*;
class chackmagic
{
void main()
{
Scanner ob=new Scanner(System.in);
System.out.println("Input the length");
int n=ob.nextInt();
int a[][]=new int[n][n];
int i,j;
System.out.println("Input the 2D Array");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=ob.nextInt();
}
}
int ld=0,rd=0;
for(i=0;i<n;i++)
{
ld=ld+a[i][i];
rd=rd+a[i][n-i-1];
}
int r,c;
int flag=1;
for(i=0;i<n;i++)
{
r=0;
c=0;
for(j=0;j<n;j++)
{r=r+a[i][j];
c=c+a[j][i];
}
if(r!=c || r!=ld || r!=rd || c!=ld || c!=rd)
{
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("Magic Square");
}
else
{
System.out.println("Not");
}
}
}


