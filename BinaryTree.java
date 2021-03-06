public class BinaryTree
{
static class Node
{
int data;
Node left;
Node right;
Node(int d)
{
data=d;
right=left=null;
}
} 
static Node root;
//function to find the max height
int maxDepth(Node node)
{
//Base case
if(node==null)
return 0;	
else
{
int lDepth = maxDepth(node.left);
int rDepth = maxDepth(node.right);
if(lDepth>rDepth)
return lDepth + 1;		
else 
return rDepth + 1;	
}
}

public static void main(String[] args) 
{
	BinaryTree tree = new BinaryTree();
	root = new Node(5);
	root.left= new Node(6);
	root.right = new Node(7);
	root.left.left=new Node(8);
	root.left.right=new Node(9);
	root.left.left.left=new Node(10);
	int a=tree.maxDepth(root);
	System.out.println(a);
}
}
}
}

public static void main(String[] args) 
{
	BinaryTree tree = new BinaryTree();
	root = new Node(5);
	root.left= new Node(6);
	root.right = new Node(7);
	root.left.left=new Node(8);
	root.left.right=new Node(9);
	root.left.left.left=new Node(10);
	int a=tree.maxDepth(root);
	System.out.println(a);
}
}
