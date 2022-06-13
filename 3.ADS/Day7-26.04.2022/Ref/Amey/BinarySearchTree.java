import java.util.Scanner;
class BinarySearchTree{

	class Node{
		int data;
		Node left;
		Node right;
		
		public Node (int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	 Node root;
	
	
	public Node create(Node newNode,int key){
		if (newNode == null)
		{
			newNode = new Node(key);
			return newNode;
		}
		if(key <= newNode.data)
			newNode.left = create(newNode.left,key);
		else
			newNode.right = create(newNode.right,key);
		return newNode;
	}
	
	public void createnewnode(int key){
		root=create(root,key);
	}
	
	public void printInorder(Node n){
		if(n==null)
		return ;
		printInorder(n.left);
		System.out.print(n.data+" ");
		printInorder(n.right);
	}
	
	public void printPreorder(Node n){
		if(n==null)
		return;
		System.out.print(n.data+" ");
		printPreorder(n.left);
		printPreorder(n.right);
	}
	
	public void printPostorder(Node n){
		if(n==null)
		return;
		
		printPostorder(n.left);
		printPostorder(n.right);
		System.out.print(n.data+" ");
	}
	
	public void printInorder(){
		printInorder(root);
	}
	
	public void printPreorder(){
		printPreorder(root);
	}
	
	public void printPostorder(){
		printPostorder(root);
	}
	
	public Node deleteNode(Node delete, int key){
		
		if(delete == null)
		{
			
			return delete;
		}
		if(key < delete.data)
			delete.left = deleteNode(delete.left,key);
		else if(key > delete.data)
			delete.right = deleteNode(delete.right,key);
		else{
			if(delete.left == null)
				return delete.right;
			else if(delete.right == null)
				return delete.left;
			
			delete.data = minValue(delete.right);
			delete.right = deleteNode(delete.right,delete.data);
		}
		return delete;
	}
	
	public void deleteBSTNode(int key){
		root=deleteNode(root,key);
		System.out.print("Inorder : ");
		printInorder();
	}
	
	int minValue(Node root){
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		BinarySearchTree b= new BinarySearchTree();
		
		int ch = 1;
        while (ch == 1) {
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\tBINARY SEARCH TREE OPERATIONS\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t0.Exit\n\t1.Create\t\t\t2.Inorder\t\t\t3.preorder\t\t\t4.postorder\n\t5.Delete");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
				case 0: ch=0;
						break;
                case 1:	System.out.print("Enter data : ");
						int n=sc.nextInt();
						b.createnewnode(n);
						break;
				case 2:	System.out.print("Inorder : ");
						b.printInorder();
						System.out.println();
						break;
				case 3: System.out.print("Preorder : ");
						b.printPreorder();
						System.out.println();
						break;
				case 4: System.out.print("Postorder : ");
						b.printPostorder();
						System.out.println();
						break;
				case 5: System.out.print("Enter key : ");
						int n1=sc.nextInt();
						b.deleteBSTNode(n1);
						System.out.println();
						break;
				default:System.out.println("Invalid Number");
						break;
			}
		}
	}
}