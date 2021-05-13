package visitor;

public class Broken implements Visitor {

	@Override
	public String stop(Car car) {
		return "Breaks are broken. " + car.getName() + " won't stop.";
	}

	@Override
	public String drive(Car car) {
		return "Engine is broken. " + car.getName() + " won't start.";
	}

}
