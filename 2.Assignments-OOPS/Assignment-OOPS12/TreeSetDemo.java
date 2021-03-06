import java.util.TreeSet;
import java.util.SortedSet;
class TreeSetDemo{
				public static void main(String[] args){
					TreeSet<Integer> tset=new TreeSet<Integer>();
					
					tset.add(10);
					//tset.add(0,10); //not allowed as there is no index never works on index
					tset.add(20);
					tset.add(20);
					tset.add(50);
					tset.add(30);
					tset.add(30);
					tset.add(10);
					tset.add(60);
					//tset.add(null); not allowed NPE will be thrown while sorting as it uses compareTo()
					
					System.out.println(tset);							//[10, 20, 30, 50, 60] //uniqueness and sorted
					System.out.println(tset.descendingSet());			//[60, 50, 30, 20, 10]
					
					TreeSet<String> tset2 = new TreeSet<String>();
					tset2.add("bs");
					tset2.add("as");
					tset2.add("ad");
					tset2.add("As");
					System.out.println(tset2);					          //[As, ad, as, bs]
					System.out.println(tset2.descendingSet());			  //[bs, as, ad, As] -> as per ascii value
					
					
					
					
					//BackedCollections
					
					//headSet
					SortedSet<Integer> shset=tset.headSet(30);
					System.out.println(shset);							//[10, 20]
				
					tset.add(25);
					System.out.println("tset: "+tset);					//tset: [10, 20, 25, 30, 50, 60]
					System.out.println("shset: "+shset);					//shset: [10, 20, 25]
					
					shset.add(26);
					System.out.println("tset: "+tset);					//tset: [10, 20, 25, 26, 30, 50, 60]
					System.out.println("shset: "+shset);					//shset: [10, 20, 25, 26]
					
					//tailSet
					SortedSet<Integer> stset=tset.tailSet(30);
					System.out.println("stset: "+stset);				//stset: [30, 50, 60]
					
					tset.add(12);
					System.out.println("tset: "+tset);					//tset: [10, 12, 20, 25, 26, 30, 50, 60]
					System.out.println("stset: "+stset);				//stset: [30, 50, 60]
					stset.add(43);
					tset.add(37);
					System.out.println("tset: "+tset);					//tset: [10, 12, 20, 25, 26, 30, 37, 43, 50, 60]
					System.out.println("stset: "+stset);				//stset: [30, 37, 43, 50, 60]
					
					//subSet
					SortedSet<Integer> ssset=tset.subSet(20,50);
					System.out.println("ssset: "+ssset);				//ssset: [20, 25, 26, 30, 37, 43]
					
				}


}