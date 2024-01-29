package hello;

public class Cat extends Animal {
	
	public boolean canHold;
	
	
	public Cat(String name, int age, boolean canHold) {
		super(name, age);
		this.canHold = canHold;
	}
	
	
	public void sound(int mood) {
		
		if (mood == 1) {
			System.out.println("meow!");
			return;
		}
		
		if (mood == 2) {
			System.out.println("purr purr");
			return;
			
		}
		
		if (mood == 3) {
			System.out.println("hisss!");
			return;
		}
		
		else {
			System.out.println("...?");
		}
		
		
	}
}