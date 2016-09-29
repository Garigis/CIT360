package MVC;

import java.util.HashMap;

/**
 * Created by colbycooley on 6/3/16.
 */
public class Controller {
    HashMap<String, Handler> commandMap = new HashMap();

    public void handleRequest(String command, HashMap<String,Object> data){
        Handler aCommandHandler = commandMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){
        commandMap.put(aCommand,acHandler);
    }
}
