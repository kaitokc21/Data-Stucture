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
System.out.print(root.data+" ");
Printinorder(root.right);
}
public void Delete(int data) 
{
root=DeleteRec(root,data);	
}
public Node DeleteRec(Node root,int data)
{
if(root==null)
return root;	
if(root.data>data)
root.left=DeleteRec(root.left,data);	
else if(root.data<data)
root.right=DeleteRec(root.right,data);	
else
{
if(root.left==null)
return root.right;	
else if(root.right==null)
return root.left;	
root.data=minvalue(root.right);
root.right=DeleteRec(root.right,root.data);
}
return root;
}
public int minvalue(Node root)
{
int min=root.data;
if(root.data!=min)
{
min=root.left.data;
root=root.left;
}
return min;
}
public static void main(String[] args) 
{
BinarySearchTree Tree = new BinarySearchTree();
Tree.Insert(10);
Tree.Insert(8);
Tree.Insert(12);
Tree.Insert(6);
Tree.Insert(14);
Tree.Insert(9);
Tree.Insert(11);
Tree.Insert(5);
Tree.Printinorder(Tree.root);
System.out.println();
Tree.Delete(8);
Tree.Printinorder(Tree.root);
}
}
