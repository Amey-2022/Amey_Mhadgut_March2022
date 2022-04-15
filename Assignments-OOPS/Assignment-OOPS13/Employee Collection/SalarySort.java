import java.util.Comparator;

class SalarySort implements Comparator<Employee>{
		@Override
		public int compare(Employee e1,Employee e2){
			System.out.println("Compare method invoked!!");
			return e1.getSalary().compareTo(e2.getSalary()); //ascending order
			//return e2.getSalary().compareTo(e1.getSalary()); for descending order ->Salary Sorted List:[2, B, F, 50000.0, 1, C, M, 20000.0, 3, A, M, 10000.0]
		}

}