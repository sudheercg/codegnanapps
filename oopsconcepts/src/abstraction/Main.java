package abstraction;

public class Main {

	public static void main(String[] args) {

	//	Animal animal = new Animal();
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		
		Dog dog = new Dog();
		dog.walk();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		Cat cat = new Cat();
		cat.walk();
		cat.sleep();
		cat.makeSound();
		
	}

}
