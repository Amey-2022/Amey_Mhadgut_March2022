class MyThread6 extends Thread{
		public void run(){
		for(int i=0;i<5;i++){
		System.out.println("i: "+i+" "+Thread.currentThread().getName());
		}
		}

}

class SleepDemo{
			public static void main(String[] args){
			System.out.println(Thread.currentThread().getName()+" Started");
			MyThread6 t1=new MyThread6();
			MyThread6 t2=new MyThread6();
			MyThread6 t3=new MyThread6();
			MyThread6 t4=new MyThread6();
			t1.setName("T1");
			t2.setName("T2");
			t3.setName("T3");
			t4.setName("T4");
			
			t1.start();
			try{Thread.sleep(2*1000);}catch(InterruptedException e){}
			t2.start();
			try{Thread.sleep(1*1000);}catch(InterruptedException e){}
			t3.start();
			try{Thread.sleep(3*1000);}catch(InterruptedException e){}
			t4.start();
			try{Thread.sleep(4*1000);}catch(InterruptedException e){}
			
			
			System.out.println(Thread.currentThread().getName()+" Ended");
			
			
			}
}

//after commenting try{} of 3&4
/*
main Started
i: 0 T1
i: 1 T1
i: 2 T1
i: 3 T1
i: 4 T1
i: 0 T2
i: 1 T2
i: 2 T2
i: 3 T2
i: 4 T2
i: 0 T3
main Ended
i: 1 T3
i: 2 T3
i: 0 T4
i: 3 T3
i: 1 T4
i: 4 T3
i: 2 T4
i: 3 T4
i: 4 T4
*/

/*
main Started
i: 0 T1
i: 1 T1
i: 2 T1
i: 3 T1
i: 4 T1
i: 0 T2
i: 1 T2
i: 2 T2
i: 3 T2
i: 4 T2
i: 0 T3
i: 1 T3
i: 2 T3
i: 3 T3
i: 4 T3
i: 0 T4
i: 1 T4
i: 2 T4
i: 3 T4
i: 4 T4
main Ended
*/