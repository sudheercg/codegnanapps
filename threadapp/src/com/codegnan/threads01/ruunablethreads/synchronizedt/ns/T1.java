package com.codegnan.threads01.ruunablethreads.synchronizedt.ns;

public class T1 implements Runnable  {
	
	CounterNS counterNS;
	
	T1(CounterNS counterNS){
		this.counterNS= counterNS;
	}
	public void run() { 
		
		for(int i=0; i< 1000; i++)
		counterNS.increment();
	}

}
