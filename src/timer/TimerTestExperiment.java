package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTestExperiment {
	
	public static void main(String[] args) {
		
		//A timer is created to do some activities in a particular interval
		//that is Execute class, invocation of the timer is placed in the run
		//method of a thread. And the thread is started from the main method.
		
		//The process continues for 10 seconds then the timer is cancelled.
		
		//create a timer task
		Task task = new Task();
		long interval = 2000;
		
		TaskExec taskExec = new TaskExec(task, null, interval);
		Thread timerThread = new Thread(task);
		timerThread.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		taskExec.stopTimer();	
	}
}

class Task extends TimerTask {
	public void run() {
		System.out.println("The timer called");
	}
}

class TaskExec implements Runnable {
	
	private Timer timer = null;
	private TimerTask task = null;
	private Date from = null;
	private long interval = 0;
	
	public TaskExec(TimerTask task, Date from, long interval) {
		timer = new Timer("TTMDBTimer");
		this.task = task;
		this.from = from;
		this.interval = interval;
	}
	
	public void run () {
		this.timer.schedule(task, new Date(), interval);
		System.out.println("Timer started .....................");
	}
	
	public void stopTimer() {
		this.timer.cancel();
	}
}
