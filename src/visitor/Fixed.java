package visitor;

public class Fixed implements Visitor {

	@Override
	public String stop(Car car) {
		return "Car " + car.getName() + " has stopped.";
	}

	@Override
	public String drive(Car car) {
		return "Car " + car.getName() + " has started driving.";
	}
}
