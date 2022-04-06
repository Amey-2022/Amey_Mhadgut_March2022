class Animal{
		void eat(){
			System.out.println("class Animal method eat");
		}
		void sleep(){
			System.out.println("class Animal method sleep");
		}
}

class Bird extends Animal{
		void eat(){
			System.out.println("class Bird method eat");
		}
		void sleep(){
			System.out.println("class Bird method sleep");
		}
		void fly(){
			System.out.println("class Bird method fly");
		}
}

class AnimalDemo{
			public static void main(String[] args){
				Animal a=new Animal();
				a.eat();
				a.sleep();
				
				
				
				
				Bird b=new Bird();
				b.eat();
				b.sleep();
				b.fly();
}}





/*OUTPUT

class Animal method eat
class Animal method sleep
class Bird method eat
class Bird method sleep
class Bird method fly

*/