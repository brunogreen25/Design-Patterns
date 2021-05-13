package observer;

import java.util.*;

public class MessageBoard {
	List<Observer> observers = new LinkedList<Observer>();
	
	//State
	String message;
	
	public void register(Observer o) {
		observers.add(o);
	}
	
	public void unregister(Observer o) {
		observers.remove(o);
	}
	
	private void notifyObservers() {
		for(Observer o: observers) {
			o.update();
		}
	}
	
	public void addMessage(String message) {
		this.message = message;
		notifyObservers();
	}
	
	public String getMessage() {
		return this.message;
	}

}
