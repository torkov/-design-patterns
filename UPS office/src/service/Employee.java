package service;

public abstract class Employee implements Observable {
	
	public static int ZACHUJBINA = 1;
	public static int ZASTRANATA = 2;
	public static int PLOVDIV = 3;
	public static int CLIENT = 4;

     protected int level;
	
	protected Employee nextEmployee;
	private String name;
	abstract protected void writeMessage(String message);
	abstract protected void sendMessage();
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void setNextEnployee(Employee nextEmployee) {
		this.nextEmployee = nextEmployee;
	}
	
     public void employeeMessage(int level, String message) {
		
		if(this.level == 1) {
			this.sendMessage();
			
		}if(this.level == 2) {
			this.sendMessage();
			
		}if(this.level == 3) {
			this.sendMessage();
			
		}else if(this.level >= level) {
			this.writeMessage(message);
		}
		
		if(this.nextEmployee != null) {
			this.nextEmployee.employeeMessage(level, message);
		}
	
     }
     
     public String getName() {
 		return name;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

     
	
	
	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.name;
	}

}
