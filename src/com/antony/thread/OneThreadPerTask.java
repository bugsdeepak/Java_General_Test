package com.antony.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.antony.thread.common.LoopTask;

public class OneThreadPerTask {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		//initialization, construction. At any given time only 3 active threads where
		//each thread takes one task.
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		//servicing
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		
		//these tasks have to wait (in a Task Queue) till the first three finishes
		execService.execute(new LoopTask());
		execService.execute(new LoopTask());
		
		//destruction. Not shutting down will lead to memory leak.
		execService.shutdown();
		
		//After Destruction, trying to submit a task will result in exception [RejectedExecutionException]
		//execService.execute(new LoopTask());
		
		System.out.println("Main Ends");
		
	}

}
