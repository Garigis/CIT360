package HTTP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

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


            String url2 = "http://google.com";
            String output = getUrlContents(url2);
            System.out.println("url is bad");
            //This is the actual output. It will print out the html file for the url provided above.
            System.out.println(output);
            try {
                output = getUrlContents(url2);
            }
            catch (Exception e) {
                System.out.println("url is bad");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getUrlContents(String theUrl) {

        // Try catch statement to catch an exceptions
        StringBuilder content = new StringBuilder();

        try {
            URL url = new URL(theUrl);
            //URLConnection object
            URLConnection urlConnection = url.openConnection();
            //BufferedReader object.
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String string;

            // Read from the urlconnection through bufferedreader.
            while((string = bufferedReader.readLine()) != null) {
                content.append(string + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
