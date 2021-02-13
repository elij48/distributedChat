/**
 *
 * @author Josh
 */
public class NodeMain {
    public static void main(String[] args) throws IOException {
        
        
    
    }
    //Here are the fields we need at minimum:
    
    //unique id (name)
        //generated from the generateID function
    
    //participants
        //this is list of all participants in the chat
        //starts empty
        //is overwritten with the values obtained with getParticipants()
        //or, if we are the first node, do not do that
        //just have the participants list include ourselves
    
    //IP adress
        //this is the IP adress we use 
    //port number
        //this is the port number we use
    
    
    //these are the methods we need
    
    //generateID()
        //generate a unique ID, or name
        //for this NODE, that other nodes can
        //use to fill out their participants list
    
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
        
    
    //updateParticipants()
        //Note: should probably divide into ADD and SUBTRACT participants
        //should add or subtract a participant from the participants list
        //called when we receive certain messages (such as another node
        //is leaving or has entered the chat)
    
    
    
}
