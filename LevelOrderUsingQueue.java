class Node
	{
	int data;
	Node left;
	Node right;
	Node(int a)
	{
	this.data=a;
	}
	Node()
	{
		data=0;
	}
	}
class Queue

{
    int size = 50;
    int front=-1;
    int rear=-1;
    Node arr[]= new Node[size];
    Queue()
    {
   	front=rear=-1; 
   	 
    }
   void push(Node node)
   {
  
   	if(front==-1&&rear==-1)
   	{
   		front=rear=0;
   	}	
   	else
   	{
   		rear++;
   	}	
      arr[rear]=node;
   }
   
   Node pop()
   {
   	if(front>rear)
   	{
   		return null;
   	}
   	else if(rear==-1)
   	{
   		return null;
   	}	
   	else
   	{
   		Node item=arr[front++];	
   	    return item;
   	}	
   }
   int size()
   {
   	int count=0;
   	if(front==rear)
   	{
   		count = 1;
   	}	
   	else if(front<rear) 
   	{
   		count=rear-front+1;
   	}
   return count;
   }
}
public class BinaryTree 
{

 public void level(Node root)
 {

 Queue queue= new Queue();
 queue.push(root);
 while(true)
 {
 int count = queue.size();	
 if(count==0)
 break;	
 while(count>0)
 {
 Node temp=queue.pop();	
 System.out.print(temp.data+" ");
 if(temp.left!=null)
 {
 queue.push(temp.left);
 }
 if(temp.right!=null)
 {
 queue.push(temp.right);	
 }
 count--;
 }	
 System.out.println();
 }	
 }
public static void main(String[] args) 
	{
	BinaryTree tree = new BinaryTree();
	Node root = new Node();
	root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    tree.level(root);
	}	

}
