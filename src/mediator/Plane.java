package mediator;

public class Plane extends Aircraft {
	
	protected Plane(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void land() {
		System.out.println("Plane is requesting a landing!");
		if (super.mediator.notify(this) == true) {
			System.out.println("Plane is happy to land.");
		} else {
			System.out.println("Plane will not land and is returning back.");
		}
	}
}
