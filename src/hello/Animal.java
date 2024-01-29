package hello;

public class Animal {

	private String name;
	private int age;
	
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void move() {
		System.out.println(name + " is moving");
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: "+ age + " years");
	}

}





