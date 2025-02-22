package com.codegnan.threads.d23;
// Step 1: Create a class that extends the Thread class
class MyThread extends Thread {
    // Step 2: Override the run() method
    @Override
    public void run() {
        // Code to be executed by the thread
        System.out.println("Hello from the new thread!");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Step 3: Create an instance of your thread class
        MyThread myThread = new MyThread();
        
        // Start the thread
        myThread.start();
        
        // Main thread's code
        System.out.println("Hello from the main thread!");
    }
}