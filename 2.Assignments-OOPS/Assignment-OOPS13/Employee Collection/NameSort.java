import java.util.Comparator;

class NameSort implements Comparator<Employee>{
		
		@Override
		public int compare(Employee e1,Employee e2){
			System.out.println("Compare method invoked!!");
			return e1.getName().compareTo(e2.getName());
		//e1.name and e2.name if variable not private
		}

}