package hello;

public class Main {

	public static void main(String[] args) {
		
		Animal lion = new Animal("Simba", 5);
		Animal elephant = new Animal("Dumbo", 10);
		
		
		
//		lion.move();
//		lion.displayInfo();
//		
//		elephant.displayInfo();
		
		Cat rocky = new Cat("Rocky", 6, false);
		Cat alpine = new Cat("Alpine", 6, true);
		
//		rocky.move();
		rocky.displayInfo();
//		
//		alpine.move();
		alpine.displayInfo();
		
		boolean canHold = rocky.canHold;
		System.out.println("Can you hold Rocky? " + canHold);
		
		boolean canHold2 = alpine.canHold;
		System.out.println("Can you hold Alpine? " + canHold2);
		
		
		alpine.sound(1);
		
		rocky.sound(2);

	}

}
