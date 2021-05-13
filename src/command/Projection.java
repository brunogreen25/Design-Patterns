package command;

//Receiver
public class Projection {
	
	private boolean isOn;
	
	public void display(String text) {
		if (isOn) {
			System.out.println("The text '" + text + "' is displayed on the projection board.");
		} else {
			System.out.println("The projector is turned off. Turn it on first.");
		}
	}
	
	public void turnOff() {
		System.out.println("SHUTTING DOWN THE PROJECTOR!");
		this.isOn = false;
	}
	
	public void turnOn() {
		System.out.println("TURNING PROJECTOR ON!");
		this.isOn = true;
	}
}
