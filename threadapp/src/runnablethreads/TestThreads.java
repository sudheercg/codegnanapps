package runnablethreads;

public class TestThreads {

	public static void main(String[] args) {

		// Initializing Thread T1
		T1 t1 = new T1();
		Thread thread1 = new Thread(t1);

		// Initializing Thread T2
		Thread thread2 = new Thread(new T2());

		// Initializing Thread T3
		Runnable t3 = new T3();
		Thread thread3 = new Thread(t3);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
