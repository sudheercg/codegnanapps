package com.codegnan.threads.states;
public class ThreadStopDemo {
	public static void main(String[] args) {
		Counter t = new Counter(1);
		new Thread(t).start();
	}
}

class Counter implements Runnable {
	private boolean stopCalled = false;
	private int id;
	public Counter(int id) {
		this.id = id;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (stopCalled) {
				return;
			}
			System.out.println("t[" + id + "] : " + i);
		}
	}
	
	public void stopExecution() {
		stopCalled = true;
		System.out.println("t[" + id + "] stop called...");
	}
}