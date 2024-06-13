package com.codegnan.oops.relationships;

//Has-a or Composition relationship example
public class Car {

	Engine engine;

	Car(Engine engine) {
		this.engine = engine;
	}

	public void startCar() {
		engine.start();
		System.out.println("Car Starts");
	}

}
