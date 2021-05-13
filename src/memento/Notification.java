package memento;

public class Notification {
	
	public String message;
	
	public Notification(String notification) {
		this.message = notification;
	}
	
	public String getData() {
		return this.message;
	}
}
