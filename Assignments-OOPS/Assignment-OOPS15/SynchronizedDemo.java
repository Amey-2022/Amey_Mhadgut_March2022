class Sync {
	
	synchronized void m1(){
	System.out.println(Thread.currentThread().getName()+"m1 Started");
	try{Thread.sleep(10*1000);}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+"m1 Ended");
	
	}
	
	synchronized void m2(){
	System.out.println(Thread.currentThread().getName()+"m2 Started");
	try{Thread.sleep(10*1000);}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+"m2 Ended");
	
	}

	static void m3(){
	System.out.println(Thread.currentThread().getName()+"m3 Started");
	try{Thread.sleep(5*1000);}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+"m3 Ended");
	}
	
	static synchronized void m4(){
	System.out.println(Thread.currentThread().getName()+"m4 Started");
	try{Thread.sleep(5*1000);}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+"m4 Ended");
	}
	
	static synchronized void m5(){
	System.out.println(Thread.currentThread().getName()+"m5 Started");
	try{Thread.sleep(5*1000);}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+"m5 Ended");
	}
	
	static void m6(){
	System.out.println(Thread.currentThread().getName()+"m6 Started");
	try{Thread.sleep(5*1000);}catch(InterruptedException e){}
	System.out.println(Thread.currentThread().getName()+"m6 Ended");
	}

}

class SynchronizedDemo{
				public static void main(String[] args){
				Sync s1=new Sync();
				Sync s2=new Sync();
				
				
				
				Thread t1=new Thread(){
					public void run(){
						//s1.m1();
						Sync.m6();
					}
					
				};
				
				Thread t2=new Thread(){
					public void run(){
						//s1.m3();
						Sync.m4(); 
					}
					
				};
				t1.setName("T1");
				t2.setName("T2");
				
				t1.start();
				try{Thread.sleep(20);}catch(InterruptedException e){}
				t2.start();
				
				
				
				
				
				
				}

}


/*
both called with s1.m1() and s1.m2()
T1m1 Started
T1m1 Ended
T2m2 Started
T2m2 Ended
*/

/*
both with s1.m1()
T1m1 Started
T1m1 Ended
T2m1 Started
T2m1 Ended

*/

/*
called with s1.m1() & s2.m1() respectively so started at same time	
T1m1 Started
T2m1 Started
T1m1 Ended
T2m1 Ended
*/

/*
s1.m1() and s1.m3()
T1m1 Started
T2m3 Started
T2m3 Ended
T1m1 Ended
*/



//static
/*
both called with Sync.m4() and Sync.m4()
T1m4 Started
T1m4 Ended
T2m4 Started
T2m4 Ended
*/


/*
called with Sync.m4() and Sync.m5()
T1m4 Started
T1m4 Ended
T2m5 Started
T2m5 Ended
*/

/*
called with Sync.m4() and Sync.m6()
T1m4 Started
T2m6 Started
T1m4 Ended
T2m6 Ended
*/