package memento;

//used to pack and unpack Memento objects
public class Originator {
	public Notification wrap(String message) {
		return new Notification(message);
	}
	
	public String unwrap(Notification m) {
		String data = m.getData();
		return data;
	}
}
