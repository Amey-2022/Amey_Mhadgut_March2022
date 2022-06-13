class ArrayOprns{
		int a[][]={
					{10,15,12},
					{42,23,65},
					{14,16,35}
				   };
		int b[][]={
					{14,18,17},
					{24,32,56},
					{41,61,53}
				   };
		int c[][]=new int[3][3];
		int t[][]=new int[10][30];
		
		ArrayOprns(){
			this.display();
		}
		
 void display(){
		   System.out.println("1st Matrix: ");
		   for(int i=0;i<a.length;i++){  
			 for(int j=0;j<a.length;j++){
				  System.out.print(a[i][j]+" " 	);   
			   }
			   System.out.println();
		   }
		   
		   System.out.println();
		   System.out.println("2nd Matrix: ");
		   for(int i=0;i<b.length;i++){  
			 for(int j=0;j<b.length;j++){
				  System.out.print(b[i][j]+" "); 	   
			   }
			   System.out.println();
		   }
			add();
		}
		
 void add(){																		//int a[][], int b[][]
				System.out.println();
				System.out.println("Addition of Matrix:");
				for(int i=0;i<c.length;i++){  
				for(int j=0;j<c.length;j++){
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" "); 
				}
					System.out.println();
				}
				mul();
			}

 void mul(){																		
				System.out.println();
				System.out.println("Multiplication of Matrix:");
				for(int i=0;i<c.length;i++){  
				for(int j=0;j<c.length;j++){
					c[i][j]=a[i][j]*b[i][j];
					
					System.out.print(c[i][j]+" "); 
				}
					System.out.println();
			}
				sub();
		}

 void sub(){																		//int a[][], int b[][]
				System.out.println();
				System.out.println("Substraction of Matrix:");
				for(int i=0;i<c.length;i++){  
				for(int j=0;j<c.length;j++){
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+" "); 
				}
					System.out.println();
				}
				tranpose();
			}
			
 void tranpose(){
				System.out.println();
				System.out.println("Transpose of 1st Matrix:");
				for(int i=0;i<a.length;i++){  
			 for(int j=0;j<a.length;j++){
				  System.out.print(a[j][i]+" " 	);   
			   }
			   System.out.println();
		   }
		   
		   System.out.println();
		   System.out.println("Transpose of 2nd Matrix: ");
		   for(int i=0;i<b.length;i++){  
			 for(int j=0;j<b.length;j++){
				  System.out.print(b[j][i]+" "); 	   
			   }
			   System.out.println();
		   }
			table1to30();
		}
	
 void table1to30(){
				System.out.println();
				System.out.println("Tables 1 to 30 ");
				  for(int i=0,n=1;i<t.length;i++,n++){  
				   for(int j=0,k=1;j<30;j++,k++){
					
					t[i][j]=n*k;
					
				System.out.print(String.format("%3d",t[i][j])+" ");
	
				}
				System.out.println();
				}
			}
	
}
	
	
	
	


					class ArrayOprnsDemo{
						public static void main(String[] args){
						ArrayOprns ao=new ArrayOprns();
						}
		
		
					}

