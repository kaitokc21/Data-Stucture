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
public Node Search(Node root,int data)
{
if(root==null||root.data==data)
{
return root;	
}
if(data<root.data)
{
return root.left=Search(root.left,data);	
}	
else
{
return root.right=Search(root.right,data);	
}	
}
void Insert(int data) 
{
root=InsertRec(root,data);	
}
public Node	InsertRec(Node root,int data) 
{
if(root==null)
{
root=new Node(data);
return root;
}	
if(root.data>data)
{
root.left=InsertRec(root.left,data);	
}	
else
root.right=InsertRec(root.right,data);	
return root;
}
public void Printinorder(Node root)
{
if(root==null)
return;	
Printinorder(root.left);	
System.out.print(root.data);
Printinorder(root.right);
}
public static void main(String[] args) 
{
BinarySearchTree Tree = new BinarySearchTree();
Tree.Insert(1);
Tree.Insert(2);
Tree.Insert(3);
Tree.Insert(4);
Tree.Insert(5);
Tree.Insert(6);
Tree.Insert(7);
Tree.Printinorder(Tree.root);
System.out.println();
Node search = Tree.Search(Tree.root,6);
if(search!=null)
System.out.println(search.data);
}
}
