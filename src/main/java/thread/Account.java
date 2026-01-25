package main.java.thread;

public class Account {
    
    //shared resource/item is the balance.
    private float balance;
    
    
    //we have to take care thred communication (wait, notify) only
    //there is a need. Like the producer will generate and the consumer
    //will take ONLY after the producer has generated it.
    
    //but in the following example the event credit and debit can happen
    //in any sequence at any time. So, there is no need for main.java.thread communication
    //But the reason that they are synchronized is, they use a shared resource
    //when one main.java.thread is crediting the amount, no other main.java.thread should
    //touch the balance.
    
    public synchronized void credit(int amount) {
        balance = balance + amount;
        System.out.println("Credited : " + amount);
    }
    
    public synchronized void debit(int amount) {
        if( 1000 < (balance - amount)) {
            System.err.println("No Minimum Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Debited : " + amount);
        }
    }
}
