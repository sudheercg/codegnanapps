package com.codegnan.threads01.ruunablethreads.synchronizedt;

public class Counter {
	
	static int c;
	
	public synchronized static void increment() {
		
		c++;
	}

}
