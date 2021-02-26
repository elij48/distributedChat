import java.net.*;
import java.io.*;

public class NodeServer
{
    // Loop and wait for connection
    // When conneciton is established, accept using recieverHelper object

    // Looping and waiting for connection
    public NodeServer(int portNumber)
    {
        // Creating Reciever Socket using port number as uniqueID
        ServerSocket recieverSocket;
        recieverSocket = new ServerSocket(portNumber);

        // Loop until connection is established with a client
        while(true)
        {
            new Thread(new ServerHelper(recieverSocket.accept())).start();
        }
    }

}


class ServerHelper implements Runnable
{
    // Initializing client socket, client ID (port number), and local participants list
    Socket clientSocket;
    int clientID;
    double[] participants = NodeMain.participantsList;

    // Constructor for obtaining data from client
    public ServerHelper(Socket enteredClientSocket)
    {
        clientSocket = enteredClientSocket;
        clientID = enteredClientSocket.uniqueID;
    }

    public void run()
    {
      try
      {
        // Input and output streams to send and read to client
        ObjectInputStream fromClient = new ObjectInputStream(clientSocket.getInputStream());
        ObjectOutputStream toclient = new ObjectOutputStream(clientSocket.getOutputStream());

        // Reads message object sent from client
        String messageText = fromClient.read();

        // If Message_join object is sent, update local and global participants list
        // Sends updated list back to client
        if(messageText.toLowerCase() == "join")
        {
            NodeMain.addPartcicpants((double)clientID, participants);
            participants = NodeMain.participantsList;

            toClient.writeObject(participants);

            // Close connections to client
            toclient.close();
            fromClient.close();
            clientSocket.close();
        }

        // If Message_leave object, remove from global participants list and update local list
        else if(messageText.toLowerCase() == "leave")
        {
            NodeMain.subtractParticipants((double)clientID, clientSocket.participantsList);
            participants = NodeMain.participantsList;

            // Close connections to client
            toclient.close();
            fromClient.close();
            clientSocket.close();
        }

        // If Message object, print message text
        else
        {
            System.out.println(messageText);

            // Close connections to client
            toclient.close();
            fromClient.close();
            clientSocket.close();
        }

      }

      // Catch connection error
      catch(IOException error)
      {
          System.out.println("No Connection with Client Node");
          System.out.println(error.getMessage());
      }
    }
}
