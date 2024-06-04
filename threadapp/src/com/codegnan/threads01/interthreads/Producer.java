package com.codegnan.threads01.interthreads;

public class Producer implements Runnable {
	
	W q;
	Producer(W a){
		this.q=a;
		Thread t =new Thread(this,"Producer"); 
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =0;
		while(true)
		{
		q.put(i++);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
		
		
	}

}
