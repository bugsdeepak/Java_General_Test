package thread.thread_communication;

public class ThreadTest {
    
    public static void main(String[] args) throws Exception {
        
    	//ThreadLocal<T>
        Object obj = new Object();
        
        synchronized (obj) {
            //IllegalMonitorStateException if the current thread is not the 
            //owner of the object's monitor. the following methods are used 
            //for thread communication   
            obj.wait(2000);
            obj.notify();
            obj.notifyAll();
            //and also
            Thread t = new Thread();
            t.join();
        }
    }
}
