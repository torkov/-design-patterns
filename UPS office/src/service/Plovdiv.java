package service;

public class Plovdiv extends Employee {

	public void Plovdiv(String name) {
		
		this.level = Employee.PLOVDIV;
	}

	@Override
	protected void writeMessage(String message) {
		
		System.out.println("Paketa e za Plovdiv " + message);

	}

}
