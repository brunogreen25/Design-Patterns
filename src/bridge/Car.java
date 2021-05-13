package bridge;

public class Car extends Vehicle {

	public Car(Draw drawingImpl) {
		super(drawingImpl);
	}

	@Override
	public void drive() {
		System.out.println("Car will start driving now!");
		
		System.out.print(super.drawingImpl.draw());
		System.out.print("CAR IS RIDING");
		System.out.println(super.drawingImpl.draw());
		
		System.out.println("Car has just turned off the engine!");
		System.out.println();
	}
}
