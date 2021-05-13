package mediator;

public class Helicopter extends Aircraft {
	
	protected Helicopter(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void land() {
		System.out.println("Helicopter is requesting a landing!");
		if (super.mediator.notify(this) == true) {
			System.out.println("Helicopter is happy to land.");
		} else {
			System.out.println("Helicopter will not land and is returning back.");
		}
	}
}
