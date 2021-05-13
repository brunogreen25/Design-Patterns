package state;

public class StateA implements State {

	@Override
	public void enterMethod() {
		System.out.println("Wellcome to STATE-A");
	}

	@Override
	public void continueMethod() {
		System.out.println("STATE-A is opened again");
	}

	@Override
	public void exitMethod() {
		System.out.println("Goodbye from STATE-A");
	}

}
