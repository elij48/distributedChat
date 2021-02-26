import java.io.*;
import java.lang.Math;

public class NodeMain {
    
    //initialize the class variables
    public static int[] participantsList;
    public static int myInfo;
    
    //references to client and server subparts
    static NodeClient client = null;
    static NodeServer server = null;
    
    
    
    public static void main(String[] args) throws IOException {
        
    //get the port number from the command line
    if (args.length != 1) 
    {
            System.err.println(
                "Usage: java NodeMain <port number>");
            System.exit(1);
    }
    myInfo = Integer.parseInt(args[0]);
    
    //start the client and server
    (client = new NodeClient(myInfo)).start();
    
    //now start the server
    (server = new NodeServer()).start();
    
    }
 
   
}
