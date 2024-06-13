package inheritance;

public class Bike extends Vehicle {

	boolean hasCarrier;
	
	Bike(String brand, int year, boolean hasCarrier){
		super(brand,year);
		this.hasCarrier=hasCarrier;
		
	}
	
	public void displayInfo() {
		super.displayInfo();
	    System.out.println("Has Carrier: " + (hasCarrier ? "Carrier Present" : "No Carrier"));		
	}
	
	
	public void displayInfo(int i) {
		super.displayInfo();
	    System.out.println("Has Carrier: " + (hasCarrier ? "Carrier Present" : "No Carrier"));		
	}
	
				
	public void kickStart() {
		System.out.println("The bike is being kick-started");
	}
	
	public static void main(String[] args) {
		
		Bike bike = new Bike("Yamaha", 2024, true);
		System.out.println(bike.brand);
		System.out.println(bike.year);
		System.out.println(bike.hasCarrier);
		
		bike.startEngine();
		bike.stopEngine();
		bike.displayInfo();

	}

}
