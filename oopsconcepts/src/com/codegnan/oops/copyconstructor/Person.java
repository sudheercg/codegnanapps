package com.codegnan.oops.copyconstructor;
class Person {
    private String name;
    private int age;
    private String address;

    // Regular constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Method to display the details of the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating an object using the regular constructor
        Person person1 = new Person("Alice", 30, "123 Main St");
        System.out.println("Original Person:");
        person1.displayInfo();
        System.out.println();

        // Creating a copy of the object using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("Copied Person:");
        person2.displayInfo();
    }
}
