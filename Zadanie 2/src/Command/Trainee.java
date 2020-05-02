package Command;

import java.util.ArrayList;


public class Trainee {
	
	private String training;
	private ArrayList<Viewer> viewers = new ArrayList<Viewer>();

	
	
	public void setTraining(String training)
	{
		this.training = training;
		for(Viewer viewer: this.viewers) {
			viewer.setTraining(this.training);
		}		
	}
	public void subscribe(Viewer viewer) {
		this.viewers.add(viewer);		
	}

}
