package main.java.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	
	public static void main(String[] args) {
		
		//A main.java.timer is created to do some activities in a particular interval
		//that is Execute class, invocation of the main.java.timer is placed in the run
		//method of a main.java.thread. And the main.java.thread is started from the main method.
		
		//The main.java.process continues for 10 seconds then the main.java.timer is cancelled.
		
		TaskExec task = new TaskExec();
		Thread timerThread = new Thread(task);
		timerThread.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		task.stopTimer();	
		
	}
}

class TaskExec implements Runnable {
	
	Timer timer = null;
	
	public void run () {
		
		this.timer = new Timer("TTMDBTimer");
		Execute ex = new Execute();
		this.timer.schedule(ex, new Date(), 2000);
	}
	
	public void stopTimer() {
		this.timer.cancel();
	}
	
	class Execute extends TimerTask {
		public void run() {
			System.out.println("The main.java.timer called");
		}
	}
}
