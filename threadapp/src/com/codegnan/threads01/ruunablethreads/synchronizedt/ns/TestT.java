package com.codegnan.threads01.ruunablethreads.synchronizedt.ns;

public class TestT {
	
	TestT(){
		
	}

	public static void main(String[] args) throws InterruptedException {
 
		
		CounterNS ns = new CounterNS();
		//T1 t = new T1();//OR
		Runnable t = new T1(ns);
		Thread t1= new Thread(t);
		
		Runnable r2 = new T2(ns);
		Thread t2 = new Thread(r2);
		//t1.start();// no start method in Thread
		//t2.start();// no start in Thread
		//so pass runnable obj to Thread constructor
		
		t1.start();
		t2.start();
		
		  // Wait for both threads to finish
        t1.join();
        t2.join();
		
		System.out.println(ns.c);
		
		
	}
 
}
