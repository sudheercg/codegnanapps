package runnablethreads;

public class MyRunnable implements Runnable{
	
	public void run() {
		System.out.println("My Runnable thread is running");
	}
	
	public static void main(String[] args) {
		
		//MyRunnable myRunnable = new MyRunnable();
		//	Thread thread = new Thread(myRunnable);
	
		Thread thread = new Thread(new MyRunnable());
		thread.start();
			
	}

}
