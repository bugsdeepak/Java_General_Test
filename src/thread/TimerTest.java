package thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	
	public static void main(String[] args) {
		
		//A timer is created to do some activities in a particular interval
		//that is Execute class, invocation of the timer is placed in the run
		//method of a thread. And the thread is started from the main method.
		
		//The process continues for 10 seconds then the timer is cancelled.
		
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
			System.out.println("The timer called");
		}
	}
}
