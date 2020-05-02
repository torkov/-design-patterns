package Command;

public class CommandMain {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		Trainee trainee = new Trainee();
		
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		
		Command changeTrainingToLiedown = new Liedown(trainee);
		Command changeTrainingToGetup = new Getup(trainee); 
		
		instructor.setCommand(changeTrainingToLiedown);
		instructor.ChangeTraining();
		
		instructor.setCommand(changeTrainingToGetup);
		instructor.ChangeTraining();
		
	}

	}


