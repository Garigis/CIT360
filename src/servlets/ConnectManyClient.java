package servlets;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class ConnectManyClient {

    public static void main(String[] args) {
        ConnectManyClient theClient = new ConnectManyClient();
        theClient.go();
    }
    private void go() {
        try {

            //Insert URL here.
            URL url = new URL("");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            JSONInputStream inFromServer = new JSONInputStream(connection.getInputStream());
            JSONOutputStream outToServer = new JSONOutputStream(connection.getOutputStream());
            HashMap<String, Object> request = new HashMap<>();
            request.put("command", "Speak");
            request.put("message", "hello");


            outToServer.writeObject(request);
            System.out.println("waiting for response");
            HashMap<String, Object> response = (HashMap<String, Object>) inFromServer.readObject();
            if (response.get("command").equals("Done")) {
                System.out.println("Sent request: " + request + "and  got response  " + response);
            } else {
                System.out.println("Oops. got " + response);
            }

            while(true) {
                Scanner systemInScanner = new Scanner(System.in);
                System.out.printf("Enter the message to send to the server.\n");
                String messageForServer = systemInScanner.nextLine();
                //connect to the server
                Socket toServer = new Socket("localhost", 9393);
                //setup the JSON streams
                JSONInputStream inFromServer1 = new JSONInputStream(toServer.getInputStream());
                JSONOutputStream outToServer2 = new JSONOutputStream(toServer.getOutputStream());

                HashMap<String, Object> request2 = new HashMap<>();
                request2.put("command", "Speak");
                request2.put("message", messageForServer);

                outToServer.writeObject(request2);
                System.out.println("waiting for response");
                HashMap<String, Object> response2 = (HashMap<String, Object>) inFromServer.readObject();
                if (response2.get("command").equals("Done")) {
                    System.out.println("Sent request: " + request + "and  got response  " + response2);
                } else {
                    System.out.println("Oops. got " + response2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
