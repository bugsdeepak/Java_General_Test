package com.antony.thread.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		    try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		task.run();

		Thread thread = new Thread(task);
		thread.start();

		System.out.println("Done!");
		
	}

}
