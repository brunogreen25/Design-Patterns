package mediator;

public abstract class Aircraft {
	
	private String name;
	protected Mediator mediator;
	
	protected Aircraft(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract void land();
}
