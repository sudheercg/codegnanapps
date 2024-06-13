package com.codegnan.oops.isahasa.hasa;


public class Main {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        Car myCar = new Car(myEngine); // Car has an Engine
        myCar.startCar();
    }
}
