package main.java.thread;

import main.java.thread.common.LoopTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OneThreadPerTask {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		//initialization, construction. At any given time only 3 active threads where
		//each main.java.thread takes one task.
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
		
		//After Destruction, trying to submit a task will result in main.java.exception [RejectedExecutionException]
		//execService.execute(new LoopTask());
		
		System.out.println("Main Ends");
		
	}

}
