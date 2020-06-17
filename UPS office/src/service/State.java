package service;

public interface State {
	
	public void applyState(Employee context);
	public String getStateName();

}
