package com.codegnan.threads;


public class ThreadDemo {
	public static void main(String[] args) {
		Counter t = new Counter(1);
		new Thread(t).start();
	}
}

class Counter implements Runnable {
	private int id;
	public Counter(int id) {
		this.id = id;
	}
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("t["+ id + "] : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}