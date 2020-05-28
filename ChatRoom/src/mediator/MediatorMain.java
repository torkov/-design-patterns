package mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		 MessageMediator mediator = new ChatMessageMediator();


	        User user1 = new ChatUser(mediator, "Peter");
	        User user2 = new ChatUser(mediator, "Ivan");
	        User user3 = new ChatUser(mediator, "Georgi");
	        
	        
	        mediator.addUser(user1);
			mediator.addUser(user2);
		    mediator.addUser(user3);
		    
		    
		    
		    user2.send("Hello");

			user1.send("addBot");

			user2.send("cat");

			user3.send("How are you?");
		    





  	        

	}

}
