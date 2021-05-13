package mediator;

public class UFO extends Aircraft {
	
	protected UFO(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void land() {
		System.out.println("UFO is requesting a landing!");
		if (super.mediator.notify(this) == true) {
			System.out.println("UFO is happy to land.");
		} else {
			System.out.println("UFO will not land and is returning back.");
		}
		
	}
}
