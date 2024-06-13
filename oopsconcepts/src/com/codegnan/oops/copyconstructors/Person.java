package com.codegnan.oops.copyconstructors;
class Person {
    private String name;
    private int age;
    private String address;

    //Constructor to initialize Person object.
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    //Copy Constructor
    Person(Person otherPerson){
    	this.name= otherPerson.name;
    	this.age= otherPerson.age;
    	this.address= otherPerson.address;
    }

    // Method to display the details of the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
      
    	//Creating an object of Person using regular constructor
        Person person1 = new Person("Anand",22,"Ameerpet,Hyderabad");
        person1.displayInfo();
        
        System.out.println();
        
        //Creating the copy of the object using the copy constructor
        Person person2 = new Person(person1);
        person2.displayInfo();
        
        
    }
}
