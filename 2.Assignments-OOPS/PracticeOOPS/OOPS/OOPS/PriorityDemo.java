//8.WAP to print /get/set priority of threads with an example, also for main method.

class PriorityDemo{
			public static void main(String[] args){
			System.out.print("Priority of "+Thread.currentThread().getName()+" : ");
			System.out.println(Thread.currentThread().getPriority());
			
			Thread.currentThread().setPriority(7);
			System.out.print("Priority of "+Thread.currentThread().getName()+" : ");
			System.out.println(Thread.currentThread().getPriority());
			
			Thread t1=new Thread ();
			Thread t2=new Thread ();
			
			System.out.println("Priority of Thread 1: "+t1.getPriority());
			System.out.println("Priority of Thread 2: "+t2.getPriority());
			
			t1.setPriority(10);
			t2.setPriority(3);
			
			System.out.println("Priority of Thread 1: "+t1.getPriority());
			System.out.println("Priority of Thread 2: "+t2.getPriority());
	}

}