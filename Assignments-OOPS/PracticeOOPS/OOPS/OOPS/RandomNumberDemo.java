//WAP to implement one thread that print random number and second thread that
//print fibo series.

import java.lang.Math;

class RandomNumberDemo{
			public static void main(String[] args){
				
			System.out.println(Thread.currentThread().getName()+" Started");
			
			Thread t1=new Thread(){
				public void run(){
					System.out.println("Random Number Series: "+Math.random());	
				}
			};
			
			Thread t2=new Thread(){
				public void run(){
					System.out.println();
					int n1=0,n2=1,n3;
					System.out.println("Fibonacci Series: ");	
					System.out.print(n1+" "+n2);
					
					for(int i=0;i<10;i++){
						n3=n1+n2;
						System.out.print(" "+n3);
						n1=n2;
						n2=n3;
					}
				}
			};
			
			t1.start();
			try{
				t1.join();
			}catch(InterruptedException e){}
			t2.start();

		}
}