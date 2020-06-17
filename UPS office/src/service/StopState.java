package service;

    public class StopState implements State {

	private String stateName = "STOP_STATE";

	@Override
	public void applyState(Context context) {
		
		context.setState(this);

	}

	@Override
	public String getStateName() {
		
		return this.stateName;
	}

}
