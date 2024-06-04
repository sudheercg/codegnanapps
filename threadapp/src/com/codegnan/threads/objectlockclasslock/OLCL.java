package com.codegnan.threads.objectlockclasslock;

public class OLCL {
	public synchronized void m1() {
		System.out.println("m1: " + Thread.currentThread());
	}

	public synchronized void m2() {
		System.out.println("m2: " + Thread.currentThread());
	}

	public static void main(String[] args) {
		OLCL olcl = new OLCL();
		Thread thread1= new Thread(new Thread1(olcl));
		Thread thread2 = new Thread(new Thread2(olcl));	
		thread1.start();
		thread2.start();
	}
}

class Thread1 implements Runnable {	
	OLCL olcl;
	Thread1(OLCL olcl){
		this.olcl=olcl;
	}
	public void run() {
		olcl.m1();
		olcl.m2();
	}
}

class Thread2 implements Runnable {
	OLCL olcl;	
	Thread2(OLCL olcl){
		this.olcl=olcl;
	}
	public void run() {
		olcl.m1();
		olcl.m2();

	}
}
