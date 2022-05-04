import java.util.Scanner;

class CircularQueueUsingArray1
{
	int rear;
	int front;
	int queue[] = new int[5];
	
	
	public CircularQueueUsingArray1()
	{
		rear = -1;
		front = -1;
		
	}
	
	boolean isEmpty()
	{
		return (rear == -1 && front == -1);
	}
	
	boolean isFull()
	{
		return ( (rear + 1) % queue.length == front);
	}
	
	
	void enqueue(int val)
	{
		if(isFull())
			throw new RuntimeException("Queue is full");
		if(front == -1 && rear == -1)
		{
			front = rear = 0;
			queue[rear] = val; 
		}
		else
		{
			rear = (rear+1) % queue.length;
			queue[rear] = val;
		}
		
	}
	
	
	void dequeue( )
	{
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		
		//queue contains only one element
		if(front == rear)
		{
			System.out.println("Dequed element : "+queue[front]);
			front = rear = -1;
		}
		else
		{
			System.out.println("Dequed element : "+queue[front]);
			front++;
			
		}
		
	}
	
	
	void display()
	{
		int i = front;
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		System.out.print("Enqueued element : ");
		for( i=front;i!=rear;i=(i+1)%queue.length)
			{
				System.out.print(" "+queue[i]+"  ");
			}
			System.out.print(" "+queue[i]+"  ");
			System.out.println();
			

	}
	
	void peek()
	{
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
	
		System.out.println("Dequed element : "+queue[rear]);
			
		
		
	}
	
	void count()
	{
		int count = 0;
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		for(int i = front;i<=rear;i++)
		{
			count++;
		}
		System.out.println("Number of element is the queue  : "+count);
	}
	
	public void count(){
		if(isEmpty())
		{
			System.out.println("\tCircular Queue is Empty ");
		}
		else {
			int count=(rear-front)+1;
			System.out.println("\tThe Number of Elements in circular queue : "+count);
		}
	}



	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		CircularQueueUsingArray1 s=new CircularQueueUsingArray1(); 
		int choice;
		do
		{
			
			System.out.println("\t=========================================");
			System.out.print("\t0.Exit\n\t1.enque\n\t2.dequeue\n\t3.peek\n\t4.display\n\t5.count\n\tEnter choice : ");
			choice=sc.nextInt();
			System.out.println("\t=========================================");
			switch(choice)
			{
				case 1:	try
						{
							System.out.print("\tEnter data :");
							int n1=sc.nextInt();
							s.enqueue(n1);
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
							
						break;
				case 2:	try
						{
							s.dequeue();
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
						break;
				case 3:	try
						{
							s.peek();
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
						break;
				case 4:	try
						{
							s.display();
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
						break;
				
				case 5:	try
						{
							s.count();
						}
						catch(Exception e)
						{
							System.out.println(e.getMessage());
						}
						break;
				
			}
		}
		while(choice != 0);
	}

	
	
}
