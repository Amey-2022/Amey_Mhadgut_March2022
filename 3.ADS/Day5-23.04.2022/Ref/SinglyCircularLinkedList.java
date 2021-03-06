import java.util.Scanner;
class SinglyList
{
	//list fields
	Node head;
	//list methods
	static class Node
	{
		//node fields
		int data;
		Node next;
		
		//node methods
		Node()
		{
			data = 0;
			next = null;
		}
		
		Node(int val)
		{
			data = val;
			next = null;
		}
		
	}
	
	public SinglyList()
	{
		head = null;
	}
	
	
	void display()
	{
		Node trav = head;
		System.out.println("List : ");
		if(head == null )
			return;
		do
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		while(trav!=head);
	}
	
	void addLast(int val)
	{
		//1. Create new node and initialize it
		Node newNode = new Node(val);
		//1.Special case : if head is null make new node as first node
		if(head==null)
		{
			head=newNode;
			newNode.next = head;
		}
		//general : add node at last
		else
		{
			//traverse till last node
			Node trav = head;
			while(trav.next != head)
			{
				trav = trav.next;
			}
			//new node's next should point to first element
			newNode.next = head;
			//add new node after traverse
			trav.next=newNode;
		}
		
	}
	
	void addFirst(int val)
	{
		//1. Create new node and initialize it
		Node newNode = new Node(val);
		//1.Special case : if head is null make new node as first node
		
		if(head==null)
		{
			head=newNode;
			newNode.next = head;
		}
		else
		{
			Node trav = head;
			//traverse till last node ie. node whose next ie equal to head
			while(trav.next != head)
			{
				trav=trav.next;
			}
			
			newNode.next = head;
			trav.next = newNode;
			head = newNode;
			
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
				if(trav.next==head)
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
		Node trav = head;
		
		if(head == null)
			throw new RuntimeException("List is empty");
		if(head.next == head)
			head = null;
		else
		{
			while(trav.next != head)
			{
				trav = trav.next;
			}
			
			trav.next = head.next;
			head = head.next;
		}
	}
	
	void deleteAtPos(int pos)
	{
		if(pos == 1)
			deleteFirst();
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or invalid position");
		Node temp = null,trav=head;
		for(int i=1;i<pos;i++)
		{
			if(trav.next == head)
				throw new RuntimeException("Invalid position");
			temp = trav;
			trav = trav.next;
		}
		
		temp.next = trav.next;
	}
	
	
	void deleteLast()
	{
		if(head == null )
			throw new RuntimeException("List is empty");
		if(head.next == head)
			deleteFirst();
		else{
			Node temp = null,trav=head;
			while(trav.next != head)
			{
				temp = trav;
				trav = trav.next;
			}
			
			temp.next = trav.next;
		}
	}
	
	void delAll()
	{
		head.next = null;
		head = null;
	}
	
	void count()
	{
		
		int count = 0;
		Node trav = head;
		
		do
		{
			count++;
			trav = trav.next;
		}while(trav != head);
		
		System.out.println("Size of Linked List : "+count);
	}
	
	
	
	void search(int val)
	{
		int count = 0;
		boolean bool = false;
		Node trav = head,temp=null;
		
		do
		{
			count++;
			if(trav.data == val)
			{
				bool = true;
				break;
			}
			trav = trav.next;
			
		}while(trav != head);
		
		if(bool)
		System.out.println("Element "+val+"  Found at Position : "+count);	
		else
			System.out.println("Element "+val+"  Not Found ");	
		
	}
	
}
 
class SinglyCircularLinkedList
{
	public static void main(String args[])
	{
		int choice,val,pos;
		SinglyList list = new SinglyList();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("\n0. Exit\n1. Display\n2. addFirst\n3. addLast\n4. addAtPos\n5. deleteFirst\n6. deleteLast\n7. deleteAtPos\n8. deleteAll\n9. Count\n10. Search");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();

			
			switch(choice)
			{
				case 1: //Display
					list.display();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

					break;
					
					
				case 2: //Add First
					System.out.print("Enter the val : ");
					val = sc.nextInt();
					list.addFirst(val);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

					break;
				
				case 3: //Add Last
					System.out.print("Enter the element : ");
					val = sc.nextInt();
					list.addLast(val);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

					break;
					
				case 4: //Add At Specific Position
					System.out.print("Enter the element : ");
					val = sc.nextInt();
					System.out.print("Enter the position of element : ");
					pos = sc.nextInt();
					list.addAtPos(val,pos);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
					
				case 7: //Delete At Specific Position
					System.out.print("Enter the position of element : ");
					pos = sc.nextInt();
					try
					{
						list.deleteAtPos(pos);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
					
				
				case 8:
					//delete all
					list.delAll();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
					break;
					
				case 9:
					//count
					list.count();
					System.out.println();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
					break;
					
				case 10:
					//search
					System.out.print("Enter the element to search : ");
					val = sc.nextInt();
					list.search(val);
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
					break;
					
				/*case 11:
					//reverse
					list.reverseList();
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");			
					break;*/
			}
		
		}
		while(choice!=0);
	}
}