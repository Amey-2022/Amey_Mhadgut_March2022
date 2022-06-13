import java.util.TreeMap;
import java.util.SortedMap;
import java.util.ArrayList;

class PP{

}


class CC extends PP{

}

class GenericDemo1{
		public static void main(String[] args){
			ArrayList<Integer> list=new ArrayList<>();
			
			//int[] arr=new int[];
			PP[] arr2=new PP[10];
			CC[] arr3=new CC[10];
			arr2=arr3;		//child array can be assigned to parent array
			System.out.println("*********");
			
			ArrayList<PP> list1=new ArrayList<>();
			ArrayList<CC> list2=new ArrayList<>();
			ArrayList<CC> list3=new ArrayList<>();
			//list1=list2;		//child ArrayList cant be assigned to parent ArrayList// error: incompatible types:ArrayList<CC> cannot be converted to ArrayList<PP>
			list2=list3;
			
			ArrayList<? extends PP> list4=list2; //<? extends PP> :PP k jitne bhi child classes hai unko list4 me assign kar sakte hai
			ArrayList<? extends CC> list5=list3; //<? extends CC> :CC k array list ya CC k jitne bhi child classes hai unko list5 me assign kar sakte hai
			
			//list4 & list5 me kuch bhi add nahi kar sakte...Read Only Collection
			//list4.add(new PP());
			//list5.add(new CC());
			
			//1.What type of arraylist we can assign?
			//2.what objects can be added to collection?
			
			ArrayList<? super CC> list6=list1; //<? super CC> :CC k array list ya CC k parent k arraylist.., list6 me assign kar sakte hai
			ArrayList<? super CC> list7=list2;
			ArrayList<Object> list8=new ArrayList<>();
				
			ArrayList<? super CC> list9=list8;
			list6.add(new CC());  //list6/7/9 ->objects of CC or of its child only can be added in such lists
			list7.add(new CC());
			list9.add(new CC());
			//list9.add(new PP()); //cant be added as its parent
		
			ArrayList<? super PP> list10=list1;
			list10.add(new PP());
			list10.add(new CC());
			//list10.add(new Object()); //cant be added as its parent
			 
			ArrayList<? super Object> list11=new ArrayList<Object>() ;
			list11.add(new CC()); //Anything can  be added as its parent of all classes
			list11.add(new PP());
			
			ArrayList<? extends Object> list12=list1;
			//list12.add(new PP()); //Read Only Collection
			
			ArrayList<?> list13=list1;  //wild card assignment //Read Only Collection -> Assign any collection(child or parent) to list13
			
			
			
			
			
		}
}
/*
? extends CLASSNAME
? super CLASSNAME
*/