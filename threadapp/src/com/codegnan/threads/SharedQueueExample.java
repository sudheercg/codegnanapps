package com.codegnan.threads;
import java.util.LinkedList;
import java.util.Queue;

public class SharedQueueExample {

    private static final int MAX_SIZE = 5;
    private Queue<Integer> queue = new LinkedList<>();

    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() >= MAX_SIZE) {
            System.out.println("Queue is full. Producer is waiting...");
            wait(); // Wait until queue is not full
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notify(); // Notify consumer that an item is added
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue is empty. Consumer is waiting...");
            wait(); // Wait until queue is not empty
        }
        int item = queue.remove();
        System.out.println("Consumed: " + item);
        notify(); // Notify producer that an item is consumed
        return item;
    }

    public static void main(String[] args) {
        SharedQueueExample sharedQueue = new SharedQueueExample();

        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    sharedQueue.produce(i);
                    Thread.sleep(1000); // Simulate producer producing an item
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    sharedQueue.consume();
                    Thread.sleep(1500); // Simulate consumer consuming an item
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
