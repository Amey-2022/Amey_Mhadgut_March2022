//common task share


class MyThread extends Thread{
	MyThread(String name){			//constructor for thread name
			super(name);
	}
	
	MyThread(){}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());	
		}	
		System.out.println(Thread.currentThread().getName()+" Ended");
	}
	
}

class ThreadDemo{
					public static void main(String[] args){
				System.out.println(Thread.currentThread().getName()+" Started");
						
						
					MyThread t1=new MyThread(); //new state
					t1.setName("T1");
					MyThread t2=new MyThread(); //new state
					t2.setName("T2");
					MyThread t3=new MyThread("T3"); //new state 
					//t3.setName("T3");
					MyThread t4=new MyThread("T4"); //new state
					//t4.setName("T4");
					
					System.out.println(Thread.currentThread().getName()+" Starting Threads");
					
					t1.start();
					t2.start();
					t3.start();
					t4.start();
					
					/*while(true){
						System.out.println(Thread.currentThread().getName()+" Still alive!!");
					}*/
					
					System.out.println(Thread.currentThread().getName()+" Thread invoking ended");
				
					
			}
}





/*

main Started
main Starting Threads
main Ended
0 -> T1
1 -> T1
2 -> T1
3 -> T1
4 -> T1
T1 Ended
0 -> T4
1 -> T4
0 -> T3
2 -> T4
3 -> T4
4 -> T4
0 -> T2
1 -> T2
1 -> T3
2 -> T2
T4 Ended
2 -> T3
3 -> T2
3 -> T3
4 -> T3
4 -> T2
T3 Ended
T2 Ended


*/