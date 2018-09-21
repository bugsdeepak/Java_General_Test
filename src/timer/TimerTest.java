package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	
	int a =  2312;
	
	public static void main(String[] args) {
		
		//A timer is created to do some activities in a particular interval
		//that is Execute class, invocation of the timer is placed in the run
		//method of a thread. And the thread is started from the main method.
		
		//The process continues for 10 seconds then the timer is cancelled.
		
		Execute ex = new Execute();
		TaskExecution task = new TaskExecution(ex, null, 2000);
		Thread timerThread = new Thread(task);
		timerThread.setDaemon(true);
		timerThread.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception ex1) {
			ex1.printStackTrace();
		}
		
		task.stopTimer();	
		
	}
}

class Execute extends TimerTask {
	public void run() {
		System.out.println("The timer called");
	}
}

class TaskExecution implements Runnable {
	
	private Timer timer = null;
	private TimerTask ex = null;
	private Date from = null;
	private long interval = 0;
	
	public TaskExecution (TimerTask ex, Date from, long interval) {
		this.ex = ex;
		this.from = from;
		this.interval = interval;
	}
	
	public void run () {
		this.timer = new Timer("TTMDBTimer", true);
		this.timer.schedule(this.ex, new Date(), this.interval);
		System.out.println("The timer started .................");
	}
	
	public void stopTimer() {
		this.timer.cancel();
		System.out.println("The timer cancelled ..................");
	}
}
