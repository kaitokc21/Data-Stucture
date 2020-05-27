public class LevelOrder {
	static class Node
	{
	int data;
	Node left;
	Node right;
	Node(int a)
	{
	this.data=a;
	}
	}
	static Node root;
    public static Node InsertLevelOrder(int[] arr , Node node ,int i)
    {
    	if(i<arr.length)
    	{
    		Node temp = new Node(arr[i]);
    		node=temp;
            node.left=InsertLevelOrder(arr ,node.left,2*i+1);
            node.right=InsertLevelOrder(arr,node.right,2*i+2);
        }
    	return node;
    }
    static void inorderTraversal(Node root) 
    { 
        if (root == null) 
            return; 
          
        inorderTraversal(root.left); 
        System.out.print( root.data + " "); 
        inorderTraversal(root.right);  
    }  
	
	
	public static void main(String[] args) 
	{
		//LevelOrder Oder = new LevelOrder();
	    int arr[]= {1,2,3,4,5,6,7,8};
	    root=InsertLevelOrder(arr,root,0);
	inorderTraversal(root);
	}
	

}
