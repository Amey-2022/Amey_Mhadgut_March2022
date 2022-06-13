class AddThread extends Thread{
		
		public void run(){
			System.out.println(Thread.currentThread().getName()+" Started");
			int sum=0;
		
			for(int i=0;i<20;i++){
			sum=sum+i;
			}
		
			System.out.println("sum: "+sum+" "+Thread.currentThread().getName()+" Ended");
		}

}

class MulThread extends Thread{
		
		public void run(){
			System.out.println(Thread.currentThread().getName()+" Started");
			int res=1;
			
			for(int i=1;i<=10;i++){
			res=res*i;
			}
			System.out.println("res: "+res+" "+Thread.currentThread().getName()+" Ended");
		}

}



class ThreadMathDemo{
				public static void main(String[] args){
				System.out.println(Thread.currentThread().getName()+" Started");
				
				AddThread at=new AddThread();	//new state
				at.setName("Add-Thread");
				
				MulThread mt=new MulThread();
				mt.setName("Mul-Thread");
				
				at.start();
				mt.start();
				
				
				
				
				//By using Annonymoous Class
				
				Thread evenadd=new Thread(){
					
					public void run(){
						System.out.println(Thread.currentThread().getName()+" started!!");
						int res=0;
						for(int i=1;i<11;i++){
							if(i%2==0){
							res=res+i;
							}
						}
					System.out.println(res+" "+Thread.currentThread().getName()+" ended!!");
					}
				};		//new state by using annonymous class
				evenadd.setName("Even-Add");
				evenadd.start();
				
				
				
				
				Thread oddadd=new Thread(){
					
					public void run(){
						System.out.println(Thread.currentThread().getName()+" started!!");
						int res=0;
						for(int i=1;i<11;i+=2){
							res=res+i;
							
						}
					System.out.println(res+" "+Thread.currentThread().getName()+" ended!!");
					}
				};
				oddadd.setName("Odd-Add");
				oddadd.start();
				
				System.out.println(Thread.currentThread().getName()+" Ended");
				
				
		}

}
/*
main Started
Add-Thread Started
Mul-Thread Started
main Ended
Odd-Add started!!
Even-Add started!!
25 Odd-Add ended!!
sum: 190 Add-Thread Ended
30 Even-Add ended!!
res: 3628800 Mul-Thread Ended
*/