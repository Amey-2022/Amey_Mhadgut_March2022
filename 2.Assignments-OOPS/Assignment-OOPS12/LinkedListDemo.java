import java.util.LinkedList;
import java.util.Collections;


class LinkedListDemo{
				public static void main(String[] args){
					
				//String
				LinkedList<String> list3=new LinkedList<>();		// till java 6 it was necessary to write wrapper class at both side but from 7 not compulsory
				list3.add("A");
				list3.add("B");
				list3.add("C");
				list3.add(3,"D");
				//list3.add(6,"E"); //IndexOutOfBoundsException
				list3.add("E");
				list3.add("F");
				list3.add("F");
				list3.add("Amey");
				
				
				list3.remove(0);
				list3.remove("D");
				list3.remove(new String("D"));
				System.out.println(list3);        		//[B, C, E, F, F]
				
				System.out.println(list3.indexOf("L"));
				System.out.println(list3.indexOf("Amey"));				//-1
				System.out.println(list3.lastIndexOf("F"));	//4		
				
				System.out.println(list3.contains("F")); //true
				
				for(String s: list3){
					System.out.print(s+" ");			//B C E F F 
				}


						//Character
						LinkedList<Character> list=new LinkedList<>();
						list.offer('A');
						list.offer('B');
						list.offer('C');
						list.offer('D');
						list.addFirst('E');
						list.add(0,'F');
						list.offer('A');
						Character c=list.peek();
						System.out.println(c);
						System.out.println(list);		//[F, E, A, B, C, D, A]

						c=list.poll();  //list.pollFirst
						System.out.println(list);  //[E, A, B, C, D, A]
						
						//static utility
						Collections.sort(list);
						System.out.println(list);   //[A, A, B, C, D, E]
						
						



}
}