package collections;

/**
 * Created by colbycooley on 4/30/16.
 */

// Use runnables

public class Deadlocks {

    // This class shows what deadlocks are. A deadlock is when multiple threads get "locked" forever waiting for each
    // other to finish.

    // Nasty for DeadLocks
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        DeadTest1 test = new DeadTest1();
        DeadTest2 test2 = new DeadTest2();

        test.run();
        test2.run();
    }

    static class DeadTest1 implements Runnable {
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    static class DeadTest2 implements Runnable {
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");
                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}