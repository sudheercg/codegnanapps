package com.codegnan.threads01;

public class ThreadDemo01 {
	
	public static void main(String[] args) {
		
		Thread thread1 = Thread.currentThread();
		System.out.println(thread1);
		thread1.setPriority(Thread.NORM_PRIORITY+2);
		System.out.println(thread1);
		
		/*
		 * for(int i=1; i<=10; i++) { System.out.println(i); try { Thread.sleep(2000);
		 * }catch(InterruptedException ie) {
		 * 
		 * } }
		 */
		
		
	}

}
