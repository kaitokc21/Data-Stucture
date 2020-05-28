//INSERT A NODE IN BST
//CHECK IF IT IS BST
//DELETE A NODE FROM BST
//INORDER SUCCESOR
package intro;

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
public Node InorderSuccesor(Node rooot ,Node temp)
{
Node root=rooot;	
if(temp.right!=null)
return minval(temp.right);
Node succ=null;
while(root.data!=temp.data)
{
if(root.data>temp.data)	
{
succ=root;
root=root.left;
}
else if(root.data<temp.data)
{
root=root.right;
}
else 
break;
}
return succ;
}
public Node minval(Node root)
{
Node min=root;
while(min.left!=null)
{
min=min.left;	
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
Node temp = Tree.root.left.left.left;
Node succ = Tree.InorderSuccesor(Tree.root,temp);
}
}
