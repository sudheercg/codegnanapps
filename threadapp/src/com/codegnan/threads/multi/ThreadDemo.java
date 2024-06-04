package com.codegnan.threads.multi;
class ThreadDemo {
	public static void main(String[] args) {
		Counter t1 = new Counter(1);
		Counter t2 = new Counter(2);
		new Thread(t1).start();
		new Thread(t2).start();
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