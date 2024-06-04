package com.codegnan.threads01.interthreads;

public class Main {
	public static void main(String[] args) {
		W  w= new W();
		
		Producer p = new Producer(w);
		Consumer q = new Consumer(w);
		
		
	}

}
