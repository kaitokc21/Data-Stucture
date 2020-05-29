class Node {
	int data;
	Node left;
	Node right;
	Node(int d)
	{
		data=d;
	}
}
class stack
{
int max=100;
int top=-1;
Node  arr[]= new Node[max];
stack()
{
top=-1;	
}
void push(Node node)
{
if(top==max)
{
	
}
else 
{
arr[++top]=node;	
}
}
Node pop() 
{
if(top==-1)
{
return null;	
}	
else
{
Node item= arr[top--];
return item;
}
}
int size()
{
int count=top+1;	
return count;
}
}
public class Inorder {
	
	Node node;
	Inorder()
	{
		node=null;
	}
	
public void InorderTraversal(Node node)	
{
if(node==null)
return;	
stack stack = new stack();
Node current=node;
while(current!=null||stack.size()!=0)
{	
if(current!=null)
{
stack.push(current);	
current=current.left;
}
else {
current=stack.pop();
System.out.print(current.data+" ");
current=current.right;
}
}
}
public static void main(String[]args) 
{
Inorder In= new Inorder();	
In.node=new Node(1);
In.node.left=new Node(2);
In.node.right=new Node(3);
In.node.left.left=new Node(4);
In.node.left.right=new Node(5);
In.node.right.left=new Node(6);
In.node.right.right=new Node(7);
In.InorderTraversal(In.node);
}
}
