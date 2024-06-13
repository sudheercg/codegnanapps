package abstraction;

//abstract is created with "abstract" keyword
abstract class Animal {

	// abstract class can have both concrete methods as well as abstract methods

	// Concrete method - implementation is provided
	public void walk() {
		System.out.println("Animal walks");
	}

	// Concrete method - implementation is provided
	public void sleep() {
		System.out.println("Animal Sleeps");
	}

	// abstract method - no implementation
	abstract void makeSound();

}
