/**
 *
 * @author Josh
 */
import java.io.*;
import java.lang.Math;

public class NodeMain {
    public static void main(String[] args) throws IOException {
        
        
    
    }
    //Here are the fields we need at minimum:
    
    //unique id (name)
    double uniqueID = generateID();
        //generated from the generateID function
    
    //participants
        //this is list of all participants in the chat
        //starts empty
        //is overwritten with the values obtained with getParticipants()
        //or, if we are the first node, do not do that
        //just have the participants list include ourselves
    double participantsList[];
    
    //IP adress
    //this is the IP adress we use
    
    double IPadress;
    //port number
    //this is the port number we use
    double portNumber;
    
    
    //these are the methods we need
    //generateID()
    public double generateID()
    {
        //generate a unique ID, or name
        //for this NODE, that other nodes can
        //use to fill out their participants list    
        
        //temporarily we set this as a random number, prob will change
        return Math.random();
    }
    
    //getMessage()
        //gets a message that was sent by another
        //connected node (into our NodeServer)
        //and displays it
        //mostly relies upon the receiveMessage() 
        //function from the NodeServer
        //continual loop once connection is established
        //to see if we got a message
    
    
    //sendMessage()
        //sends a message to all other nodes
        //using our NodeClient
        //tell each NodeClient to send the passed in
        //message to whichever node that client is
        //connected to
    
    //joinChat()
        //establish a connection with the default node
        //send a message asking for the participants list
        //(this will be the getParticipants function)
        //wait to receive the participants list
            //when that happens, disconnect
        //break connection
        //loop through participants list
        //establish a connection with each one
        //add our information to the participants list
        //(this will be the updateParticipants function)
        //send the list of participants to each node
    
        
    
    //leaveChat()
        //send a message to each node we're connected to
        //to remove THIS node from their participants list
        //after message has been sent to each node, disengage connection
        
    
    //getParticipants()
        //sends a message asking for the participants list
        //once participants list is obtained, update ours
        //conditional if we're the first node in the list
        
    
    //subtractParticipants removes the selected participant from the list
    //should be called with the current participants list
    public static double[] subtractParticipants(double participantToSubtract,
            double[] participantsList)
    {
        double[] newArray = new double[participantsList.length - 1];
        int index;
        int newArrayIndex = 0;
        for(index = 0; index < participantsList.length - 1; index++)
        {
            //add to the new array only if its not the value we dont like
            if(participantsList[index] != participantToSubtract)
            {
                newArray[newArrayIndex] = participantsList[index];
                newArrayIndex++;
            }
        }
        return newArray; 
    }
    
    //addParticipants adds the participant to the participantsList
    //should be called with the current participants list
    public void addParticipants(double participantToAdd,
            double[] participantsList)
    {
        double[] newArray = new double[participantsList.length + 1];
        int index;
        for (index = 0; index < participantsList.length; index++)
        {
            newArray[index] = participantsList[index];
        }
        //now add the new participant to the end
        newArray[index] = participantToAdd;
        
    }
    
    
}
