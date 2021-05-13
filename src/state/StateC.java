package state;

public class StateC implements State {
	
	@Override
	public void enterMethod() {
		System.out.println("Wellcome to STATE-C");
	}

	@Override
	public void continueMethod() {
		System.out.println("STATE-C is opened again");
	}

	@Override
	public void exitMethod() {
		System.out.println("Goodbye from STATE-C");
	}
	
}
