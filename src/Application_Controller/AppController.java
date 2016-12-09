package Application_Controller;

import sun.rmi.server.Dispatcher;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.server.RemoteCall;

/**
 * Created by colbycooley on 12/8/16.
 */
public class AppController extends Application_Controller.Dispatcher{
    private Dispatcher dispatcher;

    public AppController()
    {
        dispatcher = new Dispatcher() {
            @Override
            public void dispatch(Remote remote, RemoteCall remoteCall) throws IOException {

            }
        };
    }

    private boolean isPageRequested()
    {
        //here you have to write Authentication logic
        System.out.println("The page was requested successfully.");
        return true;
    }

    private void trackRequest( String request )
    {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest( String request ) throws InterruptedException {
        // log each request
        trackRequest(request);
        if (isPageRequested()) {
            dispatch(request);
        }
    }
}
