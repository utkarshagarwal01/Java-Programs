public class Dequeue
{
int arr[]=new int[100];
int lim,front,rear,i;
Dequeue(int l)
{
lim=l;
front=0;
rear=0;
}
void addfront(int val)
{
if(rear<lim)
{
for(i=rear;i>front;i++)
{
arr[i]=arr[i-1];
}
arr[front]=val;
rear++;
}
else
{
System.out.print("overflow from front");
}}
void addrear(int val)
{
if(rear<lim)
{
arr[rear++]=val;
}
else
{
System.out.print("overflow from rear");
}}
int popfront()
{
if(front<=rear)
{
return arr[front ++];
}
else
{
return -9999;
}
}
int poprear()
{
if(front<=rear)
{
return arr[--rear];
}
else
{
return -9999;
}}
void display()
{
for(i=front;i<=rear;i++)
{
System.out.print(arr[i]);
}

}
}
