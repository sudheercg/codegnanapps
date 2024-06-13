package com.codegnan.oops.constructorchaining;

public class Dog extends Animal{
	
	String name;
	int age;
	
	Dog(){
		this("Jimmy");
	}
	
	Dog(String name){
		this(name, 15);
	}
	
	Dog(String name, int age){
		//chaining to a superclass constructor
		super("Dog");
		//this("name");
		this.name = name;
		this.age = age;
		System.out.println("Dog constructor with 2 args");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
	}
}