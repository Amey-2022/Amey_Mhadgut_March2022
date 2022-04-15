class AddRunnable implements Runnable{
	public void run(){
	System.out.println(Thread.currentThread().getName()+"Started");
		int sum=0;
		for(int i=0;i<10;i++){
		sum=sum+i;
		}	
	System.out.println("sum: "+sum+" "+Thread.currentThread().getName()+"Ended");
	}
}

class MulRunnable implements Runnable{
	public void run(){
	System.out.println(Thread.currentThread().getName()+"Started");
		int mul=1;
		for(int i=1;i<10;i++){
		mul=mul+i;
		}	
	System.out.println("mul: "+mul+" "+Thread.currentThread().getName()+"Ended");
	}
}


class RunnableDemo2{
		public static void main(String... args){
		System.out.println(Thread.currentThread().getName()+"Started");
		
		AddRunnable ar=new AddRunnable();
		MulRunnable mr=new MulRunnable();
		
		Thread t1=new Thread (ar,"Add-Thread");// new state
		Thread t2=new Thread (mr,"Mul-Thread");// new state
		
		t1.start();
		t2.start();
		
		
		
		//Runnable by Annonymous Class
		Runnable evenadd=new Runnable(){	
		public void run(){
		System.out.println(Thread.currentThread().getName()+"Started");
			int res=0;
			for(int i=0;i<10;i+=2){
				res+=i;
			}
			System.out.println("res: "+res+" "+Thread.currentThread().getName()+"Ended");	
		}
		};
		Thread t3=new Thread(evenadd,"Even-Add");// new state
		t3.start();
		
		//Runnable by Lambda Expression
		Runnable oddadd=()->{	
		
		System.out.println(Thread.currentThread().getName()+"Started");
			int res=0;
			for(int i=1;i<10;i+=2){
				res+=i;
			}
			System.out.println("res: "+res+" "+Thread.currentThread().getName()+"Ended");
		};
		Thread t4=new Thread(oddadd,"Odd-Add");// new state
		t4.start();
	}
}


/*
mainStarted
Add-ThreadStarted
Mul-ThreadStarted
Even-AddStarted
Odd-AddStarted
res: 20 Even-AddEnded
mul: 46 Mul-ThreadEnded
sum: 45 Add-ThreadEnded
res: 25 Odd-AddEnded
*/