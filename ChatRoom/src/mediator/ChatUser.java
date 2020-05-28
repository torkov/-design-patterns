package mediator;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		
		if(message.equals("addBot")) {
			
			Singleton bot = Singleton.getInstance("Bot");
			bot.sendMessage("Bot is Created");

			System.out.println(this.name + " command " + message);
		}
		
		if(message.equals("cat")){
			Singleton bot = Singleton.getInstance("Bot");
			bot.sendMessage("This word is forbidden");
			mediator.sendMessage("This word is forbidden", this);
			bot.blockUser(this.name);
			mediator.blockUser(this);
			
		  System.out.println(this.name + " is block from chat room !");
		
		}else {
 	
				System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
        
		}

	}

	@Override
	public void receive(String message) {
		 System.out.println(this.name + " receives:" + message);
		

	}

}
