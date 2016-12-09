package Application_Controller;

/**
 * Created by colbycooley on 12/8/16.
 */
public class ThirdPage {
    public void show() throws InterruptedException {
        System.out.println("Displaying Third Page");
        System.out.println();

        GladOs glad = new GladOs();

        Thread Gladosthread = new Thread(glad);

        Gladosthread.start();
        Gladosthread.sleep(1000);
    }
}
