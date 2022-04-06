import java.util.*;


class Person{
	String name,gen;
	int age;

    void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name: ");
	this.name=sc.nextLine();
	System.out.println("Enter gender: ");
	this.gen=sc.nextLine();
	System.out.println("Enter age: ");
	this.age=sc.nextInt();
	}
	
	void setdata(){
	System.out.println("Name         : "+this.name);
	System.out.println("Gender       : "+this.gen);
	System.out.println("Age          : "+this.age);
	}


}

class Student extends Person{
	int sid;
	void getdata(){
	super.getdata();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter StudentID: ");
	this.sid=sc.nextInt();
	//this.setdata();
	}
	
	void setdata(){
	System.out.println();
	System.out.println("***Student Information***");
	super.setdata();
	System.out.println("StudentID    : "+this.sid);
	}
}

class Teacher extends Person{
	int tid,sal;
	String sub;
	
	void getdata(){
	super.getdata();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter TeacherID: ");
	this.tid=sc.nextInt();
	System.out.println("Enter Salary: ");
	this.sal=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Subject: ");
	this.sub=sc.nextLine();
	this.setdata();
	}
	
	void setdata(){
		System.out.println();
	System.out.println("***Teacher Information***");
	super.setdata();
	System.out.println("TeacherID    : "+tid);
	System.out.println("Salary       : "+sal);
	System.out.println("Subject      : "+sub);
	}

}


class CollegeStudent extends Student{
	int lev;
	String stm;
	
	
	void getdata(){
	super.getdata();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Level: ");
	this.lev=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Stream: ");
	this.stm=sc.nextLine();
	this.setdata();
	}
	
	void setdata(){
		
		System.out.println();
	System.out.print("     ***College***");
	super.setdata();
	System.out.println("Level        : "+lev);
	System.out.println("Stream       : "+stm);
	}

}


class CollegeInfo{
	
			public static void main(String[] args){
		System.out.println("***Welcome to college information portal***");
		System.out.println("Enter Your Choice:");	
		System.out.println("1.Student 2.Teacher 3.College Student");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		
		
		
		
		
		switch(n){
			
				case 1:Student s=new Student();
						s.getdata();
						s.setdata();
						break;	
				
				case 2: Teacher t=new Teacher();
						t.getdata();
						break;
						
				case 3:CollegeStudent cs=new CollegeStudent(); 
						cs.getdata();
						//.setdata();
						break;
			
			
		}
	
	}
}




/*Output

***Welcome to college information portal***							
Enter Your Choice:
1.Student 2.Teacher 3.College Student
1
Enter name:
Amey
Enter gender:
male
Enter age:
27
Enter StudentID:
019

***Student Information***
Name         : Amey
Gender       : male
Age          : 27
StudentID    : 19





***Welcome to college information portal***
Enter Your Choice:
1.Student 2.Teacher 3.College Student
2
Enter name:
Faculty
Enter gender:
male
Enter age:
45
Enter TeacherID:
65654
Enter Salary:
100000
Enter Subject:
subject

***Teacher Information***
Name         : Faculty
Gender       : male
Age          : 45
TeacherID    : 65654
Salary       : 100000
Subject      : subject






***Welcome to college information portal***
Enter Your Choice:
1.Student 2.Teacher 3.College Student
3
Enter name:
Amey
Enter gender:
male
Enter age:
27
Enter StudentID:
019
Enter Level:
4
Enter Stream:
mechanical

     ***College***
***Student Information***
Name         : Amey
Gender       : male
Age          : 27
StudentID    : 19
Level        : 4
Stream       : mechanical



*/
