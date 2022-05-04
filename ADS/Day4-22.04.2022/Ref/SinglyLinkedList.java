import java.util.Scanner;
class SinglyList
{
	//Node is static member class of SinglyList
	 static class Node
	{
		//Node class field
		int data;
		Node next;
		//Node class method
		public Node()
		{
			data = 0;
			next = null;
		}
		
		public Node(int val)
		{
			data = val;
			next = null;
		}
	}
	
	Node head;
	public SinglyList()
	{
		head = null;
	}
	
	void display()
	{
		Node trav = head;
		
		while(trav!=null)
		{
			System.out.print(trav.data+"  ");
			trav = trav.next;
		}
		System.out.println("");
	}
	
	void addFirst(int val)
	{
		//1. Create new node and initialize it
		Node newNode = new Node(val);
		//1.Special case : if head is null make new node as first node
		
		if(head==null)
		{
			//head should point to new node
			head=newNode;
		}
		else
		{
			//new node next should point to head
			newNode.next=head;
			//head should point to new node
			head=newNode;
			
		}
		
	}
	
	
	void addLast(int val)
	{
		//1. Create new node and initialize it
		Node newNode = new Node(val);
		//1.Special case : if head is null make new node as first node
		if(head==null)
		{
			head=newNode;
		}
		//general : add node at last
		else
		{
			//traverse till last node
			Node trav = head;
			while(trav.next != null)
			{
				trav = trav.next;
			}
			//add new node after traverse
			trav.next=newNode;
		}
		
	}
	
	void addAtPos(int val,int pos)
	{
		//allocate &init new node
		//special case1: if list is empty, add node at the start
		//special case1: if pos<=1, add node at start
		if(head==null || pos<=1)
			addFirst(val);
		//general: add node at give pos
		else
		{
			Node newNode = new Node(val);
			//traverse till pos-1
			Node trav=head;
			
			for(int i=1;i<pos-1;i++)
			{
				//special case3: if pos > length of list,add node at end
				if(trav.next==null)
					break;
				trav = trav.next;
			}
			//newNode's next should point to trav's next
			newNode.next = trav.next;
			//trav's next should point to newNode
			trav.next = newNode;
		}
	}
	
	
	void deleteFirst()
	{
		//special cas1: if list is empty, throw exception
		if(head == null)
			throw new RuntimeException("List is empty");
		//general1: make head pointing to next node
		head = head.next;
		//note: the old first node will be garbage collected.
		
	}
	
	
	void deleteAtPos(int val,int pos)
	{
		//special cas1: if pos ==1,delete first node
		if(pos==1)
			deleteFirst();
		//special cas2: if list is empty or pos < 1,then throw exception
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid Position");
		
		//take tempointer running behind trav
		Node temp = null, trav = head;
		//traverse till position
		for(int i=1;i<pos;i++)
		{
			//special case3: if pos is beyond list length, then throw exception
			if(trav==null)
				throw new RuntimeException("List is empty or Invalid Position");
			temp = trav;
			trav = trav.next;
			
		}
		//trav is  node to be deleted and temp is node before that 
		temp.next = trav.next;
		//trav node will be garbage collected
			
	
	}
	
	void deleteLast()
	{
		//special case1: if list is empty
		if(head == null )
			throw new RuntimeException("List is empty");
		Node trav = head;
		if(trav.next == null)
			head = null;
		else
		{
			if(trav.next.next == null)
			{
				trav=trav.next;
			}
			trav.next = null;
		}
		
	}
	
	void delAll()
	{
		head = null;
		//all node will be garbage collected
	}

	
	
}

class SinglyLinkedList
{
	public static void main(String args[])
	{
		int choice,val,pos;
		SinglyList list = new SinglyList();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("\n0. Exit\n1. Display\n2. addFirst\n3. addLast\n4. addAtPos\n5. deleteFirst\n6. deleteLast\n7. deleteAtPos\n8. deleteAll");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: //Display
					list.display();
					break;
					
				case 2: //Add First
					System.out.print("Enter the val : ");
					val = sc.nextInt();
					list.addFirst(val);
					break;
				
				case 3: //Add Last
					System.out.print("Enter the element : ");
					val = sc.nextInt();
					list.addLast(val);
					break;
					
				case 4: //Add At Specific Position
					System.out.print("Enter the element : ");
					val = sc.nextInt();
					System.out.print("Enter the position of element : ");
					pos = sc.nextInt();
					list.addAtPos(val,pos);
					break;
					
				case 5: //Delete First
					try
					{
						list.deleteFirst();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
				
				case 6: //Delete Last
					
					try
					{
						list.deleteLast();
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
				case 7: //Delete At Specific Position
					System.out.print("Enter the element : ");
					val = sc.nextInt();
					System.out.print("Enter the position of element : ");
					pos = sc.nextInt();
					try
					{
						list.deleteAtPos(val,pos);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					break;
					
				
				case 8:
					list.delAll();
					break;
					
			}
		
		}
		while(choice!=0);
	}
}