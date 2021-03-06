import java.util.Scanner;

class CQueueArray{
		int cqueue[];
		int front;
		int rear;
		
		public CQueueArray(int size){
			cqueue=new int[size];
			front=-1;
			rear=-1;
		}
		
		
		public boolean isEmpty(){
			return (front==-1 && front==-1);
				
		}
		
		public boolean isFull(){
			return ((rear+1)%cqueue.length==front);
		}
		
		public void enqueue(int val){
			if(isFull())
				System.out.println("Circular Queue is Full !!!");
			else if(isEmpty()){
				front=rear=0;
				cqueue[rear]=val;
			}else{
				rear=(rear+1)%cqueue.length;
				cqueue[rear]=val;	
			}
		}
		
		public void dequeue(){
			if(isEmpty())
				System.out.println("Circular Queue is empty!!!");
			
			else if(front==rear){
				System.out.println("Dequeue element from queue is "+cqueue[front]);
				front=rear=-1;
			}else{
				System.out.println("Dequeue element from queue is "+cqueue[front]);
				front=(front+1)%cqueue.length;
			}				
		}
		
		
		public void peek(){
			if(isEmpty())
				System.out.println("Circular Queue is Empty !!!");
			else{
				System.out.println("Peek element is: "+cqueue[front]);
			}
		}
		
		public void display(){
			if(isEmpty())
				System.out.println("Circular Queue is Empty !!!");
			else{
				int i=0;
			for( i=front;i!=rear;i=(i+1)%cqueue.length)
			{
				System.out.print(" "+cqueue[i]+"  ");
			}
			System.out.print(" "+cqueue[i]+"  ");
			System.out.println();
			System.out.print("");
			
			for( i=front;i!=rear;i=(i+1)%cqueue.length)
			{
				System.out.print("["+i+"]"+"  ");
			}
			System.out.print("["+i+"]"+"  ");
				
			}
		}
		
		
		public void count(){
			if(isEmpty())
		{
			System.out.println("Circular Queue is Empty ");
		}
		else {
			int count=(rear-front)+1;
			System.out.println("The Number of Elements in circular queue : "+count);
		}
	}
		
		
		public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of Queue: ");
		int n=sc.nextInt();
		CQueueArray q=new CQueueArray(n);
		
		int choice=0;
		do{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.println("\t0.Exit \t1.Enqueue \t2.Dequeue \t3.Peek \t4.Display \t5.Count\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.print("Enter Choice: ");
			choice=sc.nextInt();
			switch(choice){
					
				
				case 1: System.out.print("\tEnter element :");
						int val=sc.nextInt();
						q.enqueue(val);
						break;
				case 2:	q.dequeue();
						System.out.println();
						break;
				case 3:	q.peek();
						System.out.println();
						break;
				case 4:	q.display();
						System.out.println();
						break;
				case 5:	q.count();
						System.out.println();
						break;
			}
			
			
			
		}while(choice!=0);
	}
		
		
		


}