package memento;

import java.util.*;

public class Caretaker {
	
	Originator originator;
	Stack<Notification> history;
	
	public Caretaker(Originator originator, Stack<Notification> history) {
		this.originator = originator;
		this.history = new Stack<Notification>();
		if (history != null) {
			this.history.addAll(history);
		}
	}
	
	public void addToHistory(String message) {
		Notification m = this.originator.wrap(message);
		history.push(m);
	}
	
	public String undo() {
		Notification m = this.history.pop();
		return this.originator.unwrap(m);
	}
	
	public boolean isHistoryEmpty() {
		return this.history.isEmpty();
	}

}
