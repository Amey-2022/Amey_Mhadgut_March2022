class DeadLockDemo2{
			
			
			synchronized void m1(){
			System.out.println("m1");
			try{Thread.sleep(50);}catch(InterruptedException e){}
			
			}
			
			
			synchronized void m2(){
			System.out.println("m2");
			try{Thread.sleep(50);}catch(InterruptedException e){}
			
			}
			
			public static void main(String[] args){
			DeadLockDemo d1=new DeadLockDemo();
			DeadLockDemo d2=new DeadLockDemo();
			
			Thread t1=new Thread(){
				public void run(){
					synchronized(d1){
					System.out.println("Got d1 lock");
					try{Thread.sleep(50);}catch(InterruptedException e){}
					System.out.println("Waiting for d2 lock");
					synchronized(d2){
					System.out.println("D2 ka lock mil gaya");
					}
				 }
				}
			};
			
			
			Thread t2=new Thread(){
				public void run(){
					synchronized(d2){
					System.out.println("Got d2 lock");
					try{Thread.sleep(50);}catch(InterruptedException e){}
					System.out.println("Waiting for d1 lock");
					synchronized(d1){
					System.out.println("D1 ka lock mil gaya");
					}
				  }
				}
			};
			
			t1.start();
			try{Thread.sleep(10);}catch(InterruptedException e){}
			t2.start();
	}
}