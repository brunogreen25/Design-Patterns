package visitor;

public abstract class Car {
	
	private String name;
	
	protected Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract String acceptDrive(Visitor v);
	public abstract String acceptStop(Visitor v);
}
