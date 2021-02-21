public class Message {
	// String containing the message of the user
	// will be fetched by the main's sendMessage method for sending
	
	// The message may be set using a scanner class in the NodeMain
	String message;
	
	//simple identifier for checking what kind of message this is
	//0 for join message, 1 for leave message, 2 for any other message
	int messageIdentifier;
	
	//constructor to set message
	public Message(String input){
		message = input;
		messageIdentifier = 2;
	}
}

public class Message_Join extends Message {
	// Specific message for joining the chat
	String joinMessage;
	
	//simple identifier for checking what kind of message this is
	//0 for join message, 1 for leave message, 2 for any other message	
	int messageIdentifier;
	
	//construtor to set variables
	public Message_Join(){
		joinMessage = " joined the chat";
		messageIdentifier = 0;
	}
}

public class Message_Leave extends Message {
	// Specific message for leaving the chat
	String leaveMessage;
	
	//simple identifier for checking what kind of message this is
	//0 for join message, 1 for leave message, 2 for any other message	
	int messageIdentifier;
	
	//construtor to set variables
	public Message_Join(){
		joinMessage = " has left the chat";
		messageIdentifier = 1;
	}
}
