import java.util.Scanner;
class QueueArray{
		int queue[];
		int front;
		int rear;
		
		public QueueArray(int size){
			queue=new int[size];
			front=-1;
			rear=-1;
		}
		
		public boolean isEmpty(){
			return (front==-1 && rear==-1);
				
		}
		
		public boolean isFull(){
			return (rear==queue.length-1);
		}
		
		public void enqueue(int data){
			if(isFull()){
				System.out.println("Queue is full!!!");
				return;
			}
			else if(isEmpty()){
				front=rear=0;
				queue[rear]=data;
			}
			else{
				rear++;
				queue[rear]=data;
			}
				
			
			
		}
		
		public void dequeue(){
			if(isEmpty())
				System.out.println("Queue is empty!!!");
			else if(front==rear){	
				System.out.println("Dequeue element from queue is "+queue[front]);
				front=rear=-1;
			}
			else{
				System.out.println("Dequeue element from queue is "+queue[front]);
				front++;
			}	
		}
		
		public void peek(){
			if(isEmpty())
				System.out.println("Queue is empty!!!");
			else{
				System.out.println("Peek element is: "+queue[front]);
				
			}
		}
		
		public void display(){
			if(isEmpty())
				System.out.println("Queue is empty!!!");
			else{
				for(int i=front;i<rear+1;i++){
					System.out.print(queue[i]+"  ");		
				}
				System.out.println();
				for(int i=front;i<rear+1;i++){
					System.out.print("["+i+"] " );		
				}
			}
		}
		
		public void count(){
			int count=0;
			if(isEmpty()){
				System.out.println("Queue is empty!!!");
				return;
			}
			for(int i=front;i<rear+1;i++){
			count++;
			}	
			System.out.println("Number of elements in queue: "+count);
		}
		
		
		public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of Queue: ");
		int n=sc.nextInt();
		QueueArray q=new QueueArray(n);
		
		int choice=0;
		do{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.println("\t0.Exit \t1.Enqueue \t2.Dequeue \t3.Peek \t4.Display \t5.Count\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.print("Enter Choice: ");
			choice=sc.nextInt();
			switch(choice){
					
				
				case 1: System.out.print("Enter element :");
						int val=sc.nextInt();
						q.enqueue(val);
						System.out.println();
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