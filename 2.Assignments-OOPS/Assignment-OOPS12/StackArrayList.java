import java.util.*;
import java.util.ArrayList;

class StackArrayList{
			public static void main(String[] args){
			
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			
			Scanner sc=new Scanner(System.in);
			int lastIndex=-1;
			int choice=0;
			
			do{
			System.out.println();
			System.out.println("1.Add");
			System.out.println("2.Remove");
			System.out.println("3.Peek");
			System.out.println("4.Display\n");
			choice=sc.nextInt();
			
			switch(choice){
				case 0:break;
				case 1:
						System.out.println("Add Element: ");
						int n=sc.nextInt();
						list.add(n);
						//lastIndex++;
						lastIndex=list.indexOf(n);
						break;
				
				case 2: if(list.isEmpty()){
						System.out.println("Stack is Empty");
						}else{
							int x=list.remove(lastIndex);
							lastIndex--;
							System.out.println("Removed: "+x);
						}break;
				
				case 3: if(list.isEmpty()){
						System.out.println("Stack is Empty");
						}else{
							int x=list.get(lastIndex);
							System.out.println("Peek Element : "+x);
						}break;
				case 4: if(list.isEmpty()){
						System.out.println("Stack is Empty");
						}else{
							for(Integer val: list){
							System.out.print(val+" ");
							}
						}break;	
						
				}	
			}while(choice!=0);
		}

}