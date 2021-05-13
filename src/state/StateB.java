package state;

public class StateB implements State {
	
	@Override
	public void enterMethod() {
		System.out.println("Wellcome to STATE-B");
	}

	@Override
	public void continueMethod() {
		System.out.println("STATE-B is opened again");
	}

	@Override
	public void exitMethod() {
		System.out.println("Goodbye from STATE-B");
	}
}
