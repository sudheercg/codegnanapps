package com.codegnan.javathreads;

public class ThreadDemo05 extends Thread{
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		System.out.println("Thread starting");
		t.start(); 
		for(int i=0;i<0;i++) {
			System.out.println("Main Thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("End of main method");
	} 

}
