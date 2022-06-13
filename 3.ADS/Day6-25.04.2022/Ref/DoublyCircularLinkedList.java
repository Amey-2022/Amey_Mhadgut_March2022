import java.util.Scanner;
class DoublyList
{
	//list class
	static class Node
	{
		//node class fields
		int data;
		Node next;
		Node prev;
		
		//node class methods
		Node()
		{
			data = 0;
			next = null;
			prev = null;
		}
		
		Node(int val)
		{
			data = val;
			next = null;
			prev = null;
		}
	}
	
	//list fields 
	Node head;
	
	//list methods
	DoublyList()
	{
		head = null;
	}
	
	
	void displayForward()
	{
		Node trav = head;
		if(head == null)
		{
			System.out.println("List is Empty ");
			return;
		}
		
		System.out.println("List : ");
		do
		{
				System.out.print(trav.data+ " -> ");
				trav= trav.next;
		}
		while(trav != head);
		System.out.println("");
	}
	
	void displayReverse()
	{
		Node trav = head.prev;
		if(head == null)
		{
			System.out.println("List is Empty ");
			return;
		}
		
		System.out.println("List : ");
		do
		{
				System.out.print(trav.data+ " -> ");
				trav= trav.prev;
		}
		while(trav != head.prev);
		System.out.println("");
	}
	
	
	void addLast(int val)
	{
		Node newNode = new Node(val);
		
		if(head == null)
		{
			newNode.next = newNode;
			newNode.prev = newNode;
			head = newNode;
		}
		
		else
		{
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev.next = newNode;
			head.prev = newNode;
		}
		
		
		
		
	}
	
	
	
	void addFirst(int val)
	{
		Node newNode = new Node(val);
		
		if(head == null)
		{
			newNode.next = newNode;
			newNode.prev = newNode;
			head = newNode;
		}
		
		else
		{
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			
			head = newNode;
			
		}
	}
	
	
	void addAtPos(int val,int pos)
	{
		
		if(head == null || pos <=1 )
			addFirst(val);
		
		else
		{
			Node newNode = new Node(val);
			Node trav = head,temp = null;
			for(int i = 1;i<pos-1;i++)
			{
				if(trav.next == null)
					break;
				trav = trav.next;
			}
			
			temp = trav.next;
			newNode.prev = trav;
			newNode.next = temp;
			trav.next = newNode;
			temp.prev = newNode;
			
		}
	}
	
	void deleteFirst()
	{
		if(head == null)
			throw new RuntimeException("List is Empty");
		if(head.next == head)
			head = null;
		else
		{
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	void deleteLast()
	{
		if( head == null )
			throw new RuntimeException("List is Empty ");
		if(head.next == null)
			head = null;
		else
		{
			Node tail = head.prev;
			tail.prev.next = head;
			head.prev = head.prev.prev;
		}
		
	}
	void deleteAtPos(int pos)
	{
		if(head == null || pos < 1)
			throw new RuntimeException("List is Empty or Invalid Position");
		if(pos == 1)
			deleteFirst();
		else
		{
			Node trav = head;
			for(int i= 1;i<pos;i++)
			{
				if(trav.next == head)
					throw new RuntimeException("List is Empty");
				trav = trav.next;
			}
			
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
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
 
class DoublyCircularLinkedList
{
	public static void main(String args[])
	{
		int choice,val,pos;
		DoublyList list = new DoublyList();
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //System.out.println("\t\t\t\t\tLINKED    LIST    OPERATIONS\n");
            System.out.println("\t0. Exit\t\t\t\t1. Display\t\t\t\t2. Insert Node at Beginning\n\t3. Insert Node at End\t\t4. Insert Node at Given Position\t5. Delete First Node\n\t6. Delete Last Node\t\t7. Delete Node at Given Position\t8. Delete All Nodes\n\t9. Delete Node\t\t\t10. Length of LinkedList\t\t11. Search Node\n\t12. Reverse LinkedList\t\t13. Sort Linkedlist\t\t\t14. Display");
            //System.out.println("\n0. Exit\n1. Display\n2. addFirst\n3. addLast\n4. addAtPos\n5.deleteFirst\n6. deleteLast\n7. deleteAtPos\n8. deleteAll\n9. Count\n10. Search\n11. displayReverse");

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();

			
			switch(choice)
			{
				case 1: //Display forward
					list.displayForward();

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
					break;
					
				
				case 8:
					//delete all
					list.delAll();
					break;
					
				case 10:
					//count
					list.count();
					System.out.println();
					break;
					
				case 11:
					//search
					System.out.print("Enter the element to search : ");
					val = sc.nextInt();
					list.search(val);
					break;
					
				case 12:
					//reverse
					list.displayReverse();
					
					break;
			}
		
		}
		while(choice!=0);
	}
}