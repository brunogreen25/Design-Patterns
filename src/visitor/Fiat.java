package visitor;

public class Fiat extends Car {

	protected Fiat(String name) {
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
