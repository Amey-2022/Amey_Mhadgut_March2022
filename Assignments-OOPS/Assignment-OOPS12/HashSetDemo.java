import java.util.HashSet;


class HashSetDemo{
					public static void main(String[] args){
					HashSet<Integer> hset=new HashSet<Integer>();
					
					hset.add(10);
					//hset.add(0,10); //not allowed as there is no index never works on index
					hset.add(10);
					hset.add(20);
					hset.add(30);
					hset.add(30);
					
					System.out.println(hset.size());    	//3
					System.out.println(hset);  				//[20, 10, 30]
					
					for(int i=0;i<20;i++){
						hset.add(i);
					}
					
					
					System.out.println(hset.size());		//22
					for(Integer val: hset){
						System.out.print(hset);
					}
					
					
					hset.remove(10);
					System.out.println(hset);
					
					System.out.println(hset.contains(10)); //false
					System.out.println(hset.contains(40)); //false
					System.out.println(hset.contains(16)); //true
			
				}
}