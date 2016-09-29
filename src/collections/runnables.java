package collections;

/**
 * Created by colbycooley on 4/27/16.
 */
public class runnables implements Runnable {

    // Preferred Way to run the runnable.
    public void run() {
        int j = 1;
        for (int i = 1; i <= 10; i++) {
            j = i * j;
            System.out.println(j);
        }
    }
}

