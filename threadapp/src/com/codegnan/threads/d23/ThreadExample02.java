package com.codegnan.threads.d23;

// Step 1: Create a class that extends the Thread class
class MyThread02 extends Thread {
    // Step 2: Override the run() method
    @Override
    public void run() {
        // Code to be executed by the new thread
        System.out.println("Hello from the new thread!");
    }
}

public class ThreadExample02 {
    public static void main(String[] args) {
        // Step 3: Create an instance of your thread class
        MyThread02 myThread = new MyThread02();
        
        // Start the thread
        myThread.start();
        
     // Get details of the main thread
        Thread mainThread = Thread.currentThread();
        // Print details of the main thread
        System.out.println("Main thread details: " + mainThread);

        
        // Main thread's code
        System.out.println("Hello from the main thread!");

       

        // Print a message after the new thread has finished
        System.out.println("Main thread finished after new thread.");
    }
}
