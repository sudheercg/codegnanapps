package com.codegnan.threads01.ruunablethreads;

public class Thread1 implements Runnable {
	
	Counter counter;
	
	Thread1(Counter counter){
		this.counter = counter;
	}
	
	public void run() {
		for(int i=0; i<1000; i++) {
			counter.increment();
		}
	}

}
