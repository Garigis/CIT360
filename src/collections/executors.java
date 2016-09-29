package collections;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by colbycooley on 4/28/16.
 */
public class executors {

    public static void main(String[] args) {
        Executor anExecutor = Executors.newCachedThreadPool();
        for(int threadCnt = 0; threadCnt < 3; threadCnt++){
            runnables aRunnable = new runnables();
            anExecutor.execute(aRunnable);
        }
        try {
            System.out.println("Running stuff");
            for(int threadCount = 0; threadCount < 3; threadCount++){
                runnables aRunnable = new runnables();
                anExecutor.execute(aRunnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


