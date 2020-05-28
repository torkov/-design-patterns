package mediator;



public class Singleton {
	
	private static Singleton instance = null;
	private Singleton() {

	}
	
	public static Singleton getInstance(String name) {

		if(instance == null) {

			if(name.equals("Bot"))
			instance = new Singleton();
		}
		return instance;

	}
	public void sendMessage(String message) {


		System.out.println("Bot: " + message);

	}
	public void blockUser(String name) {


		System.out.println("Bot block : " + name);

	}

}
