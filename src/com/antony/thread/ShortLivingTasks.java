package com.antony.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.antony.thread.common.LoopTask;

/**
 * Creates as many thread as the submitted.
 * @author abened
 *
 */
public class ShortLivingTasks {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		//initialization, construction. 
		ExecutorService execService = Executors.newCachedThreadPool();
		
		//servicing
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		
		//destruction. Not shutting down will lead to memory leak.
		execService.shutdown();
		
		System.out.println("Main Ends");
		
	}

}
