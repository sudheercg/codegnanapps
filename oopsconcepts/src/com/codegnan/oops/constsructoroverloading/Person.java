package com.codegnan.oops.constsructoroverloading;
class Person {
    private String name;
    private int age;
    private String address;

    // Constructor 1: No parameters
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not provided";
    }

    // Constructor 2: One parameter (name)
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Not provided";
    }

    // Constructor 3: Two parameters (name, age)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not provided";
    }

    // Constructor 4: Three parameters (name, age, address)
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display the details of the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Using Constructor 1
        Person person1 = new Person();
        person1.displayInfo();
        System.out.println();

        // Using Constructor 2
        Person person2 = new Person("Alice");
        person2.displayInfo();
        System.out.println();

        // Using Constructor 3
        Person person3 = new Person("Bob", 25);
        person3.displayInfo();
        System.out.println();

        // Using Constructor 4
        Person person4 = new Person("Charlie", 30, "123 Main St");
        person4.displayInfo();
    }
}
