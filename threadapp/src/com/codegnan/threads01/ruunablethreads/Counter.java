package com.codegnan.threads01.ruunablethreads;

public class Counter {

	int number;

	public synchronized void increment() {

		number++;// number = number +1;
	}

}
