//runnable interface
//takes commomn implimentation

class MyRunnable implements Runnable{
	
	@Override
	public void run(){
		for(int i=0;i<5;i++){
		//sum=sum+i;
		System.out.println("i: "+i+" "+Thread.currentThread().getName());
		}
	}

} 

class RunnableDemo1{
			public static void main(String[] args){
			MyRunnable r1=new MyRunnable(); //This is not thread
			
			Thread t1=new Thread(r1); //new state
			t1.setName("T1");
			Thread t2=new Thread(r1,"T2"); //new state
			//t1.setName("T1");
			
			t1.start();
			t2.start();		
			}

}

/*
i: 0 T2
i: 1 T2
i: 0 T1
i: 2 T2
i: 1 T1
i: 3 T2
i: 2 T1
i: 3 T1
i: 4 T2
i: 4 T1
*/