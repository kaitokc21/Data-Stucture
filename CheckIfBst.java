public class BinarySearchTree {
class Node
{
int data;
Node left;
Node right;
Node(int d)
{
  data=d;
}
}
Node root;
BinarySearchTree()
{
root=null;	
}
public void Printinorder(Node root)
{
if(root==null)
return;	
Printinorder(root.left);	
System.out.print(root.data);
Printinorder(root.right);
}
public boolean IsBst(Node root)
{
return(IsBstUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
}
public boolean IsBstUtil(Node root,int min,int max)
{
if(root==null)
return true;
if(root.data<min||root.data>max)
return false;	
return(IsBstUtil(root.left,min,root.data)&&IsBstUtil(root.right,root.data,max));
}
public static void main(String[] args) 
{
BinarySearchTree tree = new BinarySearchTree();
tree.root=tree.new Node(1);
tree.root.left=tree.new Node(2);
tree.root.right=tree.new Node(3);
tree.root.left.left=tree.new Node(4);
tree.root.left.right=tree.new Node(5);
tree.root.right.left=tree.new Node(6);
tree.root.right.right=tree.new Node(7);
tree.Printinorder(tree.root);
System.out.println(tree.IsBst(tree.root));
}
}
