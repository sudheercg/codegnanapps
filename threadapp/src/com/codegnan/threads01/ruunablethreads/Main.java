package com.codegnan.threads01.ruunablethreads;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		Thread1 runnable1 = new Thread1(counter);
		Thread thread1 = new Thread(runnable1);
		
		
		Thread2 runnable2 = new Thread2(counter);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(counter.number);
		
	}		

}
