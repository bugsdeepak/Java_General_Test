package main.java.abstractex;

import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	//Add any private variables you need here:
    private static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    private static ExecutorService executor = Executors.newFixedThreadPool(20);

    static void auditLogin(String loginId) {
        Callable task = () -> {
           //writeAuditLog(df.format(new Date()).toString(), loginId);
           return 1;
       };
       executor.submit(task);
    }

    //If necessary, use this method to cleanup
    private static void waitForWrites(){
        executor.shutdownNow(); 
        // this method will be called to make sure all writes 
        // are complete before shutdown.
        //
        // the time taken to execute this method will not be considered during evaluation
    }

}
