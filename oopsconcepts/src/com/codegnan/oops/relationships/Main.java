package com.codegnan.oops.relationships;

public class Main {

	public static void main(String[] args) {
		
		Engine myEngine = new Engine();
		Car myCar = new Car(myEngine);
		myCar.startCar();
		
	}
	
	
}
