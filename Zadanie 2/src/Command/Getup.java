package Command;

public class Getup implements Command {
	
private Trainee trainee;
	
	public Getup(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		trainee.setTraining("Getup");

	}

}
