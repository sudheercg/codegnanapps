package com.codegnan.threads01.ruunablethreads.synchronizedt;

public class TestT {

	public static void main(String[] args) throws InterruptedException {
 
		//T1 t = new T1();//OR
		Runnable t = new T1();
		Thread t1= new Thread(t);
		
		Runnable r2 = new T2();
		Thread t2 = new Thread(r2);
		//t1.start();// no start method in Thread
		//t2.start();// no start in Thread
		//so pass runnable obj to Thread constructor
		
		t1.start();
		t2.start();
		
		
		  // Wait for both threads to finish
        t1.join();
        t2.join();
		
		System.out.println(Counter.c);
		
		
	}
 
}
