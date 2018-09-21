package com.antony.thread.common;

import java.util.concurrent.TimeUnit;

public class LoopTask implements Runnable {
	
	public LoopTask() {
		this.id = ++count;
	}
	
	private static int count = 0;
	private int id;

	/**
	 * Business logic goes here
	 */
	public void run() {
		
		System.out.println("<TASK STARTED ===== " + id);
		
		for(int i=10; i>0; i--) {
			System.out.println("<" + id + "> TICK TICK " + i);
			
			try {
				TimeUnit.MILLISECONDS.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("<TASK END ===== " + id);
	}

}
