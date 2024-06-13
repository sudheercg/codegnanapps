package com.codegnan.oops.overloading.constsructor;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.displayInfo();
		
		System.out.println();
		Person person2 = new Person("Kumar");
		person2.displayInfo();
		
		System.out.println();
		Person person3 = new Person("Kumari", 23);
		person3.displayInfo();
		
		System.out.println();
		Person person4 = new Person("Ajay",15,"Hyderabad");
		person4.displayInfo();
		
		
	}


}
