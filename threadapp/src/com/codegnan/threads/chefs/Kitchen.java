package com.codegnan.threads.chefs;
public class Kitchen {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Pasta");
        Chef chef2 = new Chef("Pizza");

        chef1.start(); // Start the first chef thread
        chef2.start(); // Start the second chef thread

        // Main thread continues to run concurrently with the chef threads
        System.out.println("Main thread is doing other tasks...");

        try {
            chef1.join(); // Wait for chef1 to finish
            chef2.join(); // Wait for chef2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All chefs have finished cooking.");
    }
}
