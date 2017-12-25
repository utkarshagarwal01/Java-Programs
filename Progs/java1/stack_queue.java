class stack_queue
{
int arr[]=new int[100];
int lim;
int front; int rear;
stack_queue(int l)
{
lim=l;
rear=0;
front=0;
}
void addfront(int val)
{
if(rear<lim)
{
for(int i=rear;i>front;i--)
{
arr[i]=arr[i-1];
}
arr[front]=val;
rear++;
}
else
{
System.out.println("Overflow");
}
}
void addrear(int val)
{
if(rear<lim)
{
arr[rear++]=val;
}
else
{
System.out.println("Overflow");
}
}
int popfront()
{
if(front<=rear)
{
return arr[front++];
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
for(int i=front;i<rear;i++)
{
System.out.println(arr[i]);
}
}
}