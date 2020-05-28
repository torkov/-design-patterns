package mediator;



public abstract class User {
	
	 protected MessageMediator mediator;
     protected String name;

	public User(MessageMediator med, String name) {
		
		this.mediator = med;
        this.name = name;
		
	
	}
	
	public abstract void send(String message);

    public abstract void receive(String message);

}
