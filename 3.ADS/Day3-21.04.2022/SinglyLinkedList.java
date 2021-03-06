class SinglyLinkedList{
		Node head;//head pointer
		
		static class Node{
			int data;
			Node next;
			Node(int d){
				data=d;
				next=null;
			}
		}
		
		 void display(){
			Node n=head;
			int count=0;
			while(n!=null){
				count++;
				System.out.println(count+"  "+n.data);
				n=n.next;
			}
		}
		
		
	public static void main(String []args){
		
		
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.head=new Node(10);		//head pointing to node1
		Node second=new Node(20);	//node2 created 
		Node third=new Node(30);	//node3 created
		
		
		//connectings nodes
		l1.head.next=second;		//node1 connected  to node2
		second.next=third;			//node2 connected  to node3
		
		l1.display();
		
	}
}