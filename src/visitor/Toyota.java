package visitor;

public class Toyota extends Car {

	protected Toyota(String name) {
		super(name);
	}

	@Override
	public String acceptDrive(Visitor v) {
		return v.drive(this);
	}

	@Override
	public String acceptStop(Visitor v) {
		return v.stop(this);
	}

}
