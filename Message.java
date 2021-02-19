public class Message {
	// String containing the message of the user
	// will be fetched by the main's sendMessage method for sending
	
	// The message may be set using a scanner class in the NodeMain
	String message;
}

public class Message_Join extends Message {
	// Specific message for joining the chat
	String joinMessage = " joined the chat";
}

public class Message_Leave extends Message {
	// Specific message for leaving the chat
	String leaveMessage = " has left the chat";
}