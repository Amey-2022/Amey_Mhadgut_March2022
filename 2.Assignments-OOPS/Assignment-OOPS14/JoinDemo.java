class MyThread5 extends Thread{
	
	MyThread5(String name){
		super(name);
	}
	
	MyThread5(){}
		
		public void run(){
			for(int i=0;i<6;i++){
			System.out.println("i: "+i+" "+Thread.currentThread().getName());
			}
		}

}

class JoinDemo{
			public static void main(String[] args){
			System.out.println(Thread.currentThread().getName()+" Started");
			MyThread5 t1=new MyThread5();
			t1.setName("T1");
			MyThread5 t2=new MyThread5();
			t2.setName("T2");
			MyThread5 t3=new MyThread5("T3");
			MyThread5 t4=new MyThread5("T4");
			//t1.setName("T1");
			//t2.setName("T2");
			//t3.setName("T3");
			//t4.setName("T4");
			
			t1.start();
			try{t1.join();}catch(InterruptedException e){}
			t2.start();
			try{t2.join();}catch(InterruptedException e){}
			t3.start();
			//try{t3.join();}catch(InterruptedException e){}
			t4.start();
			//try{t4.join();}catch(InterruptedException e){}
			
			
			System.out.println(Thread.currentThread().getName()+" Ended");
			
			
			}
}


/*
main Started
i: 0 T1
i: 1 T1
i: 2 T1
i: 3 T1
i: 4 T1
i: 5 T1
i: 0 T2
i: 1 T2
i: 2 T2
i: 3 T2
i: 4 T2
i: 5 T2
main Ended
i: 0 T3
i: 1 T3
i: 0 T4
i: 1 T4
i: 2 T3
i: 2 T4
i: 3 T3
i: 3 T4
i: 4 T4
i: 4 T3
i: 5 T3
i: 5 T4
*/