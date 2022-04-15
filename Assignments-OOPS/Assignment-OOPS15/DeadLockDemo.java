class DeadLockDemo{
			static DeadLockDemo d1=new DeadLockDemo();
			static DeadLockDemo d2=new DeadLockDemo();
			
			synchronized void m1(){
			System.out.println("m1");
			try{Thread.sleep(50);}catch(InterruptedException e){}
			//d2.m2();
			synchronized(d2){
					System.out.println("Got d2 lock");
				}
				
			}
			
			synchronized void m2(){
			System.out.println("m2");
			try{Thread.sleep(50);}catch(InterruptedException e){}
			//d1.m1();
				synchronized(d1){
					System.out.println("Got d1 lock");
				}
			}
			
			public static void main(String[] args){
			 
			Thread t1=new Thread(){
				public void run(){
				d1.m1();
				}
			};
			
			
			Thread t2=new Thread(){
				public void run(){
				d2.m2();
				}
			};
			
			t1.start();
			try{Thread.sleep(10);}catch(InterruptedException e){}
			t2.start();
			}
}