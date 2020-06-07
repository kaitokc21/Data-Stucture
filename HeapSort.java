public class HeapSort {
  static int left;
  static int right;
  static int largest;
  static int n;
  public static void buildheap(int a[]) 
  {
   n=a.length-1;
   for(int i= n/2;i>=0;i--)
   {
	maxheap(a,i,n);  
   }
   }
public static void maxheap(int a[],int i,int n)
{	
left=2*i+1;
right=2*i+2;
if(left<=n && a[left]>a[i])
largest = left;
else
	largest=i;
if(right <=n && a[right]>a[largest])
largest=right;
if(largest!=i)
{
swap(i,largest,a);
maxheap(a,largest,n);
}
}
public static void swap(int a,int b,int ar[])
{	
int temp=ar[a];
ar[a]=ar[b];
ar[b]=temp;
}
  public static sort(int[]a)
  {
  for(int i=n;i>=1;i--)
	{
	swap(0,i,arr);	
	heapsize=heapsize-1;
	maxheap(arr,0,heapsize);
	}
  } 
  public static void main(String[] args) 
	{
	int arr[]= {4,3,7,1,8,5};
	buildheap(arr);
  sort(arr);
	for(int i = 0 ;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	}
	System.out.println();
	int heapsize=arr.length-1;
	
	for(int i = 0 ;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}

}
