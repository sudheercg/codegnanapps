package inheritance;

// inherit Vehicle class
public class Car extends Vehicle {

	// Create a property numberofDoors
	int numberOfDoors;

	// Create car Constructor
	Car(String brand, int year, int numOfDoors) {
		super(brand, year);
		this.numberOfDoors = numOfDoors;

	}

	// create a method honk()
	public void honk() {
		System.out.println("The car is honking");
	}

	public static void main(String[] args) {
		// create an instance of car
		Car car = new Car("Honda", 2023, 4);

		// call all the methods
		car.startEngine();
		car.stopEngine();
		car.honk();
		car.displayInfo();

	}

}
