package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {

	 private List<User> users;

	    public ChatMessageMediator() {

	        this.users = new ArrayList<>();


	    }
	
	@Override
	public void sendMessage(String message, User user) {
		  for (User u : this.users) {
	           
	            if (u != user) {
	                u.receive(message);
	           }
	        }

	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void blockUser(User user) {
		 this.users.block(user);




	}

}
