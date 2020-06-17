package service;

public class StartState implements State {

	private String stateName = "START_STATE";
		
	

	@Override
	public void applyState(Employee context) {
		
		context.setState(this);

	}

	@Override
	public String getStateName() {
		
		return this.stateName;
	}

}
