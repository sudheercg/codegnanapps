package com.codegnan.threads01;

public class TestT {

	public static void main(String[] args) {
 
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
	}

}
