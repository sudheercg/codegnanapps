package com.codegnan.threads01.interthreads;

public class Consumer implements Runnable {
	
	W q;
	Consumer(W a){
		this.q=a;
		Thread t =new Thread(this,"Consumer"); 
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =0;
		while(true)
		{
		q.get();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
		
		
	}

}
