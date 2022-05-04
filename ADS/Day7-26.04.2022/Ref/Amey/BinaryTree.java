import java.util.Scanner;
class BinaryTree{

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
	
	 Node root=null;

	public Node create(){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter data (-1 for No node) : ");
		int n=sc.nextInt();
		if(n==-1)
		{
			return null;
		}
		Node newNode= new Node(n);
		System.out.println("Enter Left Child of "+n+" : ");
		newNode.left=create();
		System.out.println("Enter Right Child of "+n+" : ");
		newNode.right=create();
		return newNode;
	}
	
	public void createnewnode(){
		root=create();
	}
		
	public void printInorder(Node n){
		if(n==null)
		return ;
		printInorder(n.left);
		System.out.print(n.data+" ");//root
		printInorder(n.right);
	}
	
	public void printPreorder(Node n){
		if(n==null)
		return;
		System.out.print(n.data+" ");//root
		printPreorder(n.left);
		printPreorder(n.right);
	}
	
	public void printPostorder(Node n){
		if(n==null)
		return;
		
		printPostorder(n.left);
		printPostorder(n.right);
		System.out.print(n.data+" ");//root
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
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		BinaryTree b= new BinaryTree();
		
		int ch = 1;
        while (ch == 1) {
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\tBINARY TREE OPERATIONS\n");
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\t0.Exit\n\t1.Create\t\t\t2.Inorder\t\t\t3.preorder\t\t\t4.postorder");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Enter your choice :");
            int choice = sc.nextInt();
            switch (choice) {
				case 0: ch=0;
						break;
                case 1:	b.createnewnode();
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
				default:System.out.println("Invalid Number");
						break;
			}
		}
	}
}