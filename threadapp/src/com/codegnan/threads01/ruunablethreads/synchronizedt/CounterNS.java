package com.codegnan.threads01.ruunablethreads.synchronizedt;

public class CounterNS {
	
	 int c;
	
	public synchronized  void increment() {
		
		c++;
	}

}
