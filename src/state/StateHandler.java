package state;

public class StateHandler {
	public State a = null;
	public State b = null;
	public State c = null;
	
	public State currentState = null;
	
	public void changeState(String nextState) {
		if (currentState != null) {
			currentState.exitMethod();
		}
		
		boolean firstTime = false;
		if (nextState.equals("A")) {
			if (a == null) {
				a = new StateA();
				firstTime = true;
			}
			currentState = a;
		} else if (nextState.equals("B")) {
			if (b == null) {
				b = new StateB();
				firstTime = true;
			}
			currentState = b;
		} else if (nextState.equals("C")) {
			if (c == null) {
				c = new StateC();
				firstTime = true;
			}
			currentState = c;
		} else {
			return;
		}
		
		if (firstTime) {
			currentState.enterMethod();
		} else {
			currentState.continueMethod();
		}
	}
}
