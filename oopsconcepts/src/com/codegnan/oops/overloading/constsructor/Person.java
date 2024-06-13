package com.codegnan.oops.overloading.constsructor;

public class Person {

	//instance variables
	private String name;
	private String address;
	private int age;

	// Constructor 1: no arguments
	Person() {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	// Constructor 2: One parameter
	Person(String name) {
		this.name = name;
		this.age = 0;
		this.address = "Not Provided";
	}

	// Constsructor 3: Two Parameters
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.address = "Not Provided";
	}

	// Constructor 4: Three parameters
	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//instance methods
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+ address);
	}
	
	
}
