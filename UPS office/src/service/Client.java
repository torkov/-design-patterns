package service;

public class Client extends Employee {

	public void Client(String name) {
		
		this.level = Employee.CLIENT;
	}

	@Override
	protected void writeMessage(String message) {
		
		System.out.println("Paketat vie priet za obrabotka " + message);

	}

}
