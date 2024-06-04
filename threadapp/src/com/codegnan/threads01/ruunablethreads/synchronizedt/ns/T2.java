package com.codegnan.threads01.ruunablethreads.synchronizedt.ns;

public class T2 implements Runnable {

	CounterNS ns;
	T2(CounterNS ns){
		this.ns= ns;
	}
	
	
	public void run() { 

		for (int i = 0; i < 1000; i++)
			ns.increment();
	}

}
