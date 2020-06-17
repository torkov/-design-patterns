package service;

public class Momche implements Observer {
	
	private String name;
	private Observable employee;

	public Momche(String name) {
		this.name = name;
		
	}

	@Override
	public void update() {
		
		if (this.employee != null) {
			System.out.println(this.name + " Paketa e premesten.");
			return;
		}
		
		if (this.employee == null) {
			System.out.println(this.name + " Paketa ne e premesten.");
			return;
		}

	}

	@Override
	public void setMomche(Observable employee) {
		
		this.employee = employee;

	}

}
