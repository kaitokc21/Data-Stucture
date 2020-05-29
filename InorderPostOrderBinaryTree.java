public class BinaryTree {
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
class Index
{
int index;	
}
Node BuildTree(int In[],int Pos[],int n) 
{
Index pIndex=new Index();	
pIndex.index=n-1;
return BuildUtil(In,Pos,0,n-1,pIndex);
}
Node BuildUtil(int In[],int Pos[],int start,int end, Index pindex)
{
if(start>end)
return null;	
Node node=new Node(Pos[pindex.index]);
(pindex.index)--;
if(start==end)
return node;
int Iindex=search(In,start,end,node.data);
node.right=BuildUtil(In,Pos,Iindex+1,end,pindex);
node.left=BuildUtil(In,Pos,start,Iindex-1,pindex);
return node;
}
int search(int In[],int start,int end,int data) 
{
int i;
for( i=start;i<=end;i++)
{
if(In[i]==data)
break;	
}
return i;
}
void preOrder(Node node) 
{ 
    if (node == null) 
        return; 
    System.out.print(node.data + " "); 
    preOrder(node.left); 
    preOrder(node.right); 
} 
public static void main(String[]args) 
{
BinaryTree tree = new BinaryTree();	
int In[]={4, 8, 2, 5, 1, 6, 3, 7};	
int Pos[]={ 8, 4, 5, 2, 6, 7, 3, 1 }; 
int n=In.length;
Node root =tree.BuildTree(In,Pos,n);
tree.preOrder(root);
}	
}
