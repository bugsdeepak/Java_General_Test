/*
 * $Id: SFCodeTemplate31.main.java.xml 67218 2009-03-18 19:07:17Z svn $
 */
package main.java.core;

public class ThreadTest extends Thread implements Runnable {
  
  public void run() {
    System.out.println("This is My main.java.thread");
  }
  
  public static void main(String[] args) {
    
    Thread t1 = new Thread (new ThreadTest());
    t1.start();
    
  }

}
