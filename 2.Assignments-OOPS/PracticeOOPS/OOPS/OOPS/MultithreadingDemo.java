//WAP to implement Multithreading where one thread is printing Hello and other
//is printing CDAC Mumbai


class MultithreadingDemo{
			public static void main(String[] args){
			
			Thread t1=new Thread(){
				public void run(){
					System.out.println("Hello");	
				}
			};
			
			Thread t2=new Thread(){
				public void run(){
					System.out.println("CDAC Mumbai");	
				}
			};
		
			t1.start();
			t2.start();
	}
}