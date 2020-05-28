package mediator;

public interface MessageMediator {
	
	void sendMessage(String message, User user);
    void addUser(User user);
    void blockUser(User user);
    

}
