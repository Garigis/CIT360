package HTTP;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by colbycooley on 10/22/16.
 */
public class HTTPConnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Response Code: " + connection.getResponseCode());
            System.out.println("Content: " + connection.getContent());
            System.out.println("Allow User Interaction: " + connection.getAllowUserInteraction());
            System.out.println("Allow User Interaction: " + connection.getAllowUserInteraction());
            System.out.println("Request Method: " + connection.getRequestMethod());
            System.out.println("Permission: " + connection.getPermission());
            System.out.println("Date: " + connection.getDate());
            System.out.println("URL: " + connection.getURL());
            System.out.println("Error Stream: " + connection.getErrorStream());
            System.out.println("Do Input: " + connection.getDoInput());
            System.out.println("Do Output: " + connection.getDoOutput());
            System.out.println(connection.getInputStream());
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
