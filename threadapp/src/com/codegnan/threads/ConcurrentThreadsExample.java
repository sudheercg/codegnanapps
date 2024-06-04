package com.codegnan.threads;
public class ConcurrentThreadsExample {

    public static void main(String[] args) {
        // Create and start multiple threads
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new MyRunnable("Thread-" + i));
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        private final String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            System.out.println("Thread " + threadName + " is running");
            // Simulate some work
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + threadName + " has finished");
        }
    }
}
