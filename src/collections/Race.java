package collections;

/**
 * Created by colbycooley on 4/30/16.
 */
public class Race {

    // This creates a race condition. A Race condition is where 2 threads are using the same variables.
    // This illustrates that because the counter below is supposed to stop at 1 million, but when ran it goes well
    // above that number because thread1 and thread2 are sharing a counter.

    public static void main(String[] args) throws InterruptedException {
        MyCounter counter = new MyCounter();

        Thread thread1 = new Thread(new CounterIncRunnable(counter));
        thread1.setName("add thread");
        thread1.start();

        Thread thread2 = new Thread(new CounterIncRunnable(counter));
        thread2.setName("add thread2");
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.value());
        System.out.print(counter.value());
    }
}


class CounterIncRunnable implements Runnable {
    private MyCounter counter;

    public CounterIncRunnable(MyCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for ( int i=0; i<1000000; i++ ) {
            counter.increment();
        }
    }
}


class MyCounter {
    private volatile int c = 0;

    public void increment(){
        c++;
    }

    public Integer value() {
        return c;
    }

}
