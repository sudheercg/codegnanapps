package com.codegnan.oops.isahasa.hasa;
// Car class demonstrating has-a relationship
public class Car {
    private Engine engine; // Car has an Engine

    Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start(); // Using Engine's method
        System.out.println("Car starts.");
    }
}
