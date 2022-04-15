import java.util.ArrayList;

class ArrayListDemo{
				public static void main(String[] args){
				ArrayList list=new ArrayList(); //Non-generic collection =no datatype in brackets <>
				list.add(10);
				list.add(20);
				list.add(0,5);
				list.add("Abc");
				list.add(new Double("20.0"));
				list.add(null);
				
				System.out.println(list.size());
				System.out.println(list.get(0));
				System.out.println(list.get(1));
				System.out.println(list.get(2));
				System.out.println(list.get(3));
				System.out.println(list.get(4));
				System.out.println(list.get(5));
				
/*output
6
5
10
20
Abc
20.0
null
*/
				ArrayList<Integer> list2=new ArrayList<>();  //cant create list of primitives only wrapper class
				list2.add(10);
				list2.add(10);
				list2.add(30);
				list2.add(40);
				list2.add(50);
				list2.add(50);
				list2.add(5,60);					//can add next index (5,60)
				//list2.add(6,60);					//  -cant add beyound 6th index RTE java.lang.IndexOutOfBoundsException:
				System.out.println(list2); 			//[10, 10, 30, 40, 50, 60, 50]
				
				list2.remove(0); 					//removes by index number
				System.out.println(list2); 			//[10, 30, 40, 50, 60, 50]
				//list2.remove(50) 					//50 consider as index RTE java.lang.IndexOutOfBoundsException:
				//System.out.println(list2);
				list2.remove(new Integer(50)); 		//the first 50 occurs as value will be removed
				System.out.println(list2);  		//[10, 30, 40, 60, 50]
				
				
				boolean contains=list2.contains(10);
				contains=list2.contains(new Integer(10));
				
				
				System.out.println(list2.size());	//5

				list2.set(0,100);
				System.out.println(list2); 			//[100, 30, 40, 60, 50] //toString of ArrayList
				
				
				for(int i=0;i<list2.size();i++){
				  System.out.print(list2.get(i)+" ");  //100 30 40 60 50
				}
				System.out.println();
				for(Integer val:list2){
					System.out.print(val+" ");				//100 30 40 60 50
				}
				
				
				System.out.println();
				System.out.println("======String=====");
				
				ArrayList<String> list3=new ArrayList<>();		// till java 6 it was necessary to write wrapper class at both side but from 7 not compulsory
				list3.add("A");
				list3.add("B");
				list3.add("C");
				list3.add(3,"D");
				//list3.add(6,"E"); //IndexOutOfBoundsException
				list3.add("E");
				list3.add("F");
				list3.add("F");
				
				
				list3.remove(0);
				list3.remove("D");
				list3.remove(new String("D"));
				System.out.println(list3);        		//[B, C, E, F, F]
				
				System.out.println(list3.indexOf("L"));			//-1
				System.out.println(list3.lastIndexOf("F"));	//4		
				
				System.out.println(list3.contains("F")); //true
				
				for(String s: list3){
					System.out.print(s+" ");			//B C E F F     
				}
				
				}
		}