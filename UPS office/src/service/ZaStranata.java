package service;

public class ZaStranata extends Employee {

	public void ZaStranata(String name) {
		
		this.level = Employee.ZASTRANATA;
	}

	@Override
	protected void writeMessage(String message) {
		
		System.out.println("Paketa e za Stranata " + message);

	}

}
