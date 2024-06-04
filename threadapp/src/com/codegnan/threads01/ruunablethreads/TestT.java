package com.codegnan.threads01.ruunablethreads;

public class TestT {

	public static void main(String[] args) {
 
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
		
		
	}
 
}
