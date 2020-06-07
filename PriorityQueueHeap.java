public class MaxPriorityQueue {
public static int left;
public static int  right;
public static int  largest;
public static int heapsize=0;
public static void buildheap(int []a)
{
   for(int i=heapsize/2;i>=1;i--)
    maxheapify(a,i,heapsize);	
}
public static void maxheapify(int[] a,int i,int size)
{
left=2*i;
right=2*i+1;
if(left<=size&&a[left]>a[i])
largest=left;
else
largest=i;
if(right<=size&&a[right]>a[largest])
largest=right;
if(largest!=i)
{
	swap(i,largest,a);
	 maxheapify(a,largest,size);
}	
}
public static void swap(int a,int b,int[]arr)
{
int temp=arr[a];
arr[a]=arr[b];
arr[b]=temp;
}
public static int maximum(int[]a)
{
return a[1];	
}
public static int extractMax(int[]a)
{
	if(heapsize==0)
	return -1;	
	int max=a[1];
	a[1]=a[heapsize];
	heapsize=heapsize-1;
	maxheapify(a,1,heapsize);
    return max;
}
public static void increasekey(int[]a,int i,int key)
{
if(a[i]>key)
{
System.out.println("Enter a larger value than current one.");	
return;
}	
a[i]=key;
while(i>1&&a[i/2]<a[i])
{
swap(i,i/2,a);
i=i/2;
}
}
public static void insert(int []a,int val)
{
heapsize=heapsize+1;
a[heapsize]=-1;
increasekey(a,heapsize,val);
}
public static void print(int[]a)
{
for(int i=1;i<=heapsize;i++)
{
	System.out.print(a[i]+" ");
}	
}
public static void main(String[]args) 
{
int arr[]=new int[20];
buildheap(arr);
insert(arr,11);
insert(arr,2);
insert(arr,20);
insert(arr,5);
insert(arr,15);
insert(arr,7);
insert(arr,18);
insert(arr,6);
insert(arr,4);
print(arr);
increasekey(arr,6,22);
System.out.println();
print(arr);
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
System.out.println(extractMax(arr));
}
}
