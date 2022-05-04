import java .util.*;

class ArrayCommonElement{
				
				//sorting arrays
				 void sortArray(int[] a){
					int temp=0;
					for(int i=0;i<a.length-1;i++){
						for(int j=0;j<a.length-1;j++){
							if (a[j]>a[j+1]){
								temp=a[j];
								a[j]=a[j+1];
								a[j+1]=temp;
							}
						}
					}
					System.out.println();
					
				}
				//display sorted arrays
				void displayArray(int a[]){
					for(int i=0;i<a.length;i++){
					System.out.print(a[i]+" ");		
					}
					System.out.println();
				}
					
	
		public static void main(String... args){
			 //3 arrays from user
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Size of Array 1: ");
			int n1=sc.nextInt();
			int a[]=new int[n1];
			for(int i=0;i<a.length;i++){
				System.out.print("a ["+i+"] = ");
				a[i]=sc.nextInt();
			}
			
			System.out.print("Enter Size of Array 2: ");
			int n2=sc.nextInt();
			int b[]=new int[n2];
			for(int i=0;i<b.length;i++){
				System.out.print("b ["+i+"] = ");
				b[i]=sc.nextInt();
			}
			
			System.out.print("Enter Size of Array 3: ");
			int n3=sc.nextInt();
			int c[]=new int[n3];
			for(int i=0;i<c.length;i++){
				System.out.print("c ["+i+"] = ");
				c[i]=sc.nextInt();
			}
			
			
			ArrayCommonElement ace=new ArrayCommonElement();
			ace.sortArray(a);
			ace.sortArray(b);
			ace.sortArray(c);
			
			System.out.print("Sorted Array 1:");
			ace.displayArray(a);
			System.out.print("Sorted Array 2:");
			ace.displayArray(b);
			System.out.print("Sorted Array 3:");
			ace.displayArray(c);
			
			
			//duplicate
			int n4=n1<n2 ? (n1<n3?n1:n3) : (n2<n3?n2:n3);
			
			int d[]=new int[n4];
			int k=0;
			
			for(int i=0;i<a.length;i++){
				for(int j=0;j<b.length;j++){
					
					if(a[i]<b[j])
						break;
					else{
						if(a[i]==b[j]){
							d[k]=a[i];
							k++;
						}
					}
				}
			}
			System.out.println("\n");
			System.out.println("Duplicate Elements in Array:");
			for(int i=0;i<c.length;i++){
				for( k=0;k<d.length;k++){
					
					if(c[i]<d[k])
						break;
					else{
						if(c[i]==d[k]){
							System.out.print(d[k]+" ");
						}
					}
				}
			}	
		}			
} 

/*

Enter Size of Array 1: 3
a [0] = 20
a [1] = 10
a [2] = 12
Enter Size of Array 2: 4
b [0] = 15
b [1] = 12
b [2] = 10
b [3] = 45
Enter Size of Array 3: 5
c [0] = 45
c [1] = 35
c [2] = 12
c [3] = 10
c [4] = 65



Sorted Array 1:10 12 20
Sorted Array 2:10 12 15 45
Sorted Array 3:10 12 35 45 65


Duplicate Elements in Array:
10 12

*/