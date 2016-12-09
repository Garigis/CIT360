package Application_Controller;

import java.util.Scanner;

public class AppControlDemo {

    public static void main( String[] args ) throws InterruptedException {
        AppController frontController = new AppController();
        // sends first request
        frontController.dispatchRequest("FIRST");
        System.out.println();
        // sends second request
        frontController.dispatchRequest("SECOND");
        System.out.println();
        // sends third request
        frontController.dispatchRequest("THIRD");
        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for testing the Aperture Labratories Page testing Unit");
        AppController app = new AppController();
        app.dispatchRequest(input.next());

    }
}
