package com.codegnan.threads;

public class ThreadDemo01 {

	public static void main(String[] args) {
		
		Thread thread1 = Thread.currentThread();
			System.out.println(thread1);
			System.out.println(thread1.getPriority());
	
	}

}
