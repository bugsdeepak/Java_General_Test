package main.java.thread.executor;

import java.math.BigDecimal;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;


public class JobExecution {
	
	
	interface JobStuff {
		/**
		 * Creates a job and return the corresponding job id
		 * The job should not block and should return immediately
		 * @param cal
		 * @return job id
		 */
		public Integer createJob(Callable<BigDecimal> cal) throws InterruptedException, ExecutionException ;
		
		/**
		 * 
		 * @param jobId the job id of the job
		 * @return the result of the Job 
		 */
		public Integer getResults(int jobId) ;
	}
	
	class JobExecutor implements JobStuff {
		
		private ExecutorService service = Executors.newFixedThreadPool(5);
		private ConcurrentHashMap<Integer, Future<BigDecimal>> jobs = new ConcurrentHashMap<>();
		private AtomicInteger jobId = new AtomicInteger(0);
				
		public Integer createJob(Callable<BigDecimal> cal) throws InterruptedException, ExecutionException  {
			Future<BigDecimal> task = service.submit(cal);
			service.shutdown();
			service.awaitTermination(2, TimeUnit.SECONDS);
			jobs.put(jobId.incrementAndGet(), task);
			return jobId.get();
		}
		
		public Integer getResults(int jobId) {
			return null;
		}
	}

	public static void main(String[] args) {
		
	}

}
