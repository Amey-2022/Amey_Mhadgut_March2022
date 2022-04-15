import java.util.ArrayList;
class Stock{
		static ArrayList<Integer> list=new ArrayList<>();
		final static int MAX_SIZE=10;
		final static int MIN_SIZE=0;
		

}

class Producer implements Runnable{
	@Override
	public void run(){
		int num=1;
		while(true){
			produce(num++);
			try{Thread.sleep(100);}catch(InterruptedException e){}
		}
	}
		
		void produce(int value){
			synchronized(Stock.list){
			  if(Stock.list.size()==Stock.MAX_SIZE){
				  System.out.println("Producer waiting..."+Stock.list.size());
				  try{Stock.list.wait();}catch(InterruptedException e){}//Thread will enter wait state but after releasing lock on Stock.list
				}
					System.out.println("Producing values.."+value);
					Stock.list.add(value);
					//Stock.list.notify();
			}	
		}
	
}

class Consumer implements Runnable{
	@Override
	public void run(){
		while(true){
			consume();
			try{Thread.sleep(100);}catch(InterruptedException e){}
		}
	}
		
			void consume(){
				
				synchronized(Stock.list){
				System.out.println("Consumer waiting..."+Stock.list.size());
				   if(Stock.list.size()==Stock.MIN_SIZE){
					  try{Stock.list.wait();}catch(InterruptedException e){}// Thread will enter wait state but after releasing lock on Stock.list
					}
				int val=Stock.list.get(0);
				Stock.list.remove(0);
				System.out.println("Consuming value.. "+val);
				//Stock.list.notify();
				}
			}
}


class PCDemo{
	public static void main(String... args)throws InterruptedException{
		Producer p=new Producer();
		Consumer c=new Consumer();
		
		
		Thread pro=new Thread(p,"Producer");
		Thread con=new Thread(c,"Consumer");
		
		
		pro.start();
		Thread.sleep(5000);
		con.start();
		
	}

}
/*
Producing values..1
Producing values..2
Producing values..3
Producing values..4
Producing values..5
Producing values..6
Producing values..7
Producing values..8
Producing values..9
Producing values..10
Producer waiting...10
Consumer waiting...10
Consuming value.. 1
Producing values..11
Consumer waiting...10
Consuming value.. 2
Producing values..12
Producer waiting...10
Consumer waiting...10
Consuming value.. 3
Producing values..13
Consumer waiting...10
Consuming value.. 4
Producing values..14
Consumer waiting...10
Consuming value.. 5
Producing values..15
Consumer waiting...10
Consuming value.. 6
Producing values..16
Consumer waiting...10
Consuming value.. 7
Producing values..17
Consumer waiting...10
Consuming value.. 8
Producing values..18
Consumer waiting...10
Consuming value.. 9
Producing values..19
*/