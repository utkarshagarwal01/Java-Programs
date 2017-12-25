import java.util.*;
class collection
{
int arr[]=new int [100];
int len;
int i,j;
collection()
{
len=0;
}
collection(int l)
{
len=l;
}
Scanner ob =new Scanner(System.in);
void inparr()
{
System.out.println("Enter elements");
for(i=0;i<len;i++)
{
arr[i]=ob.nextInt();
}
}
void arrange()
{
for(i=0;i<len-1;i++)
{
for(j=0;j<len-1-i;j++)
{
if(arr[j]>arr[j+1])
{
int t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}
}
void display()
{
for(i=0;i<len;i++)
{
System.out.println(arr[i]);
}
}
collection common(collection A, collection B)
{
collection te=new collection(len);
int i,j,flag,k=0;
for(i=0;i<B.len;i++)
{
flag=0;
for(j=0;j<A.len;j++)
{
if(B.arr[i]==A.arr[j])
{
flag=1;
break;
}
}
if(flag==1)
{
te.arr[k]=B.arr[i];
k++;
}
}
te.len=k;
return te;
}
void main()
{
collection obj=new collection(10);
obj.inparr();
collection ob1=new collection(15);
ob1.inparr();
collection ob2=new collection(0);
ob2=common(ob1,obj);
ob2.arrange();
ob2.display();
}
}