package servlets;
import java.util.HashMap;
import java.io.IOException;
import org.quickconnectfamily.json.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AddServlet", urlPatterns={"/add"})
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            // Make input and output streams
            JSONInputStream inFromClient = new JSONInputStream(request.getInputStream());
            JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());

            // Us a hashmap to hold data from the client
            HashMap<String, Object> dataMap = (HashMap) inFromClient.readObject();
            //dataMap.put("model",this.theModel);
            dataMap.put("toClient", outToClient);

            String aCommand = (String) dataMap.get("command");
            //theAppController.handleRequest(aCommand, dataMap);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
