package Command;

public class Liedown implements Command {
	
private Trainee trainee;
	
	public Liedown(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		trainee.setTraining("Liedown");

	}

}
