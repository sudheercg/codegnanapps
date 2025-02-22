package com.codegnan.javathreads;

public class ThreadFlow {

	
	public void method3() {
		System.out.println("method3 called");
		System.out.println("Method 3");
		System.out.println("method3 called");
	}
	
	
	public void method2() {
		System.out.println("method2 called");
		method3();	
		System.out.println("method2 ended");
	}
		
	public void method1() {
		System.out.println("method1 called");
		method2();
		System.out.println("method1 ended");
	}
	
	public static void main(String[] args) {
		ThreadFlow flow = new ThreadFlow();
		flow.method1();
		System.out.println("Main method ended");	
	}

}
