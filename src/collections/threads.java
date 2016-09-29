package collections;

/**
 * Created by colbycooley on 4/27/16.
 */

// Using Threads this way is nasty.

public class threads extends Thread {

    Thread testThread;

    // Nasty Path
    threads() {
        testThread = new Thread(this, "Testing a second thread.");
        testThread.start();
    }

    // Happy Path
    public void run() {
        System.out.print("This is a thread.");
    }

    public static void main(String[] args) {
        // This call runs the run() string twice
        (new threads()).start();
    }
}
