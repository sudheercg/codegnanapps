package inheritance;

public class Vehicle {
	String brand;
	int year;
	
	
	Vehicle(){}
		
	Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	public void startEngine() {
		System.out.println("Engine of " + brand + " Vehicle is starting");
	}

	public void stopEngine() {
		System.out.println("Engine of " + brand + " vehicle is stopping");
	}
	
	public void displayInfo() {
		System.out.println("Brand: "+brand+ " Year: "+year);
		
	}
	
	
}
