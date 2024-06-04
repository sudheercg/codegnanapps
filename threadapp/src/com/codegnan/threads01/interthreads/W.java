package com.codegnan.threads01.interthreads;

public class W {

	int num;

	public synchronized void put(int n) {

		this.num = n;
		System.out.println(num);
	}

	public synchronized int get() {
		System.out.println(num);
		return num;
	}

}
