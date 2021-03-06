import java.util.*;

class Person implements Comparable<Person>{
	 String name,gender,aadharNumber,panCardNuber,city,state;
	 Integer age,pincode;
	
		Person(String name,Integer age,String gender,String aadharNumber,String panCardNuber,String city,String state,Integer pincode){
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.aadharNumber=aadharNumber;
			this.panCardNuber=panCardNuber;
			this.city=city;
			this.state=state;
			this.pincode=pincode;	
		}
		//toString
		public  String toString(){
			System.out.println("toString invoked....");
			return "\nPerson: " +this.name+" , "+this.age+" , "+this.gender+" , "+this.aadharNumber+" , "+this.panCardNuber+" , "+this.city+" , "+this.state+" , "+this.pincode;
		}


		//equals
		public boolean equals(Object o){
			System.out.println("equals invoked....");
			if(o instanceof Person)//check o is type of person or not
			{
				Person temp=(Person)o;
				if(this.name.equals(temp.name)&&
					this.age.equals(temp.age)&&
					this.gender.equals(temp.gender)&&
					this.aadharNumber.equals(temp.aadharNumber)&&
					this.panCardNuber.equals(temp.panCardNuber)&&
					this.city.equals(temp.city)&&
					this.state.equals(temp.state)&&
					this.pincode.equals(temp.pincode)
				)
				{
					return true;
				}
			}
			return false;
		}

	//hashCode
	public int hashCode(){
		System.out.println("hashCode invoked....");
		int prime=1;
		prime=prime+prime*this.name.hashCode();
		prime=prime+prime*this.age.hashCode();
		prime=prime+prime*this.gender.hashCode();
		prime=prime+prime*this.aadharNumber.hashCode();
		prime=prime+prime*this.panCardNuber.hashCode();
		prime=prime+prime*this.city.hashCode();
		prime=prime+prime*this.state.hashCode();
		prime=prime+prime*this.pincode.hashCode();
		return prime;
	}
	
	public int compareTo(Person p){
		System.out.println("compareTo invoked....");
		return this.name.compareTo(p.name);
	}
	
}

class CitySort implements Comparator<Person>{
	public int compare(Person p1,Person p2){
	return p2.city.compareTo(p1.city);
	}
}


class PersonDemo{
	public static void main(String... args){
		Person p1=new Person("Amey",27,"Male","803763282487","CWAPM3132Z","Kankavli","Maharashtra",416602);
		Person p2=new Person("David",23,"Male","113533782487","AFAHM1423S","Hindale","Karnataka",547589);
		Person p3=new Person("Tanvi",12,"Female","452875694304","XTFY6578D","Ambrad","Goa",852347);
		Person p4=new Person("Balika",8,"Female","597463127031","HFRT1248K","Ganpatipule","Andhrapradesh",784565);
		Person p5=new Person("Radhe",27,"Male","687403490780","MGYU9756S","Malwan","Bihar",745698);
		Person p6=new Person("Amey",27,"Male","803763282487","CWAPM3132Z","Kankavli","Maharashtra",416602);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		
		System.out.println(p1.equals(p6));
		System.out.println(p1.hashCode());
		System.out.println(p6.hashCode());
		/*Person@fe0ad1c0
		Person@9796180
		Person@620c8000
		Person@93e2e20
		Person@d0e805e8*/
		
		ArrayList<Person> list=new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("\n\n");
		
		
		CitySort cs=new CitySort();
		Collections.sort(list,cs);
		System.out.println(list);
		System.out.println("\n\n");
		
		/*HashSet<Person> set=new HashSet<>(list);
		System.out.println(set);
		
		
		
		TreeSet<Person> set1=new TreeSet<>(list);
		System.out.println(set1);*/
	}
}