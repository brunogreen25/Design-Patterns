package bridge;

public class Plane extends Vehicle {
	
	public Plane(Draw drawingImpl) {
		super(drawingImpl);
	}

	@Override
	public void drive() {
		System.out.println("Plane will kick off now!");
		
		System.out.print(super.drawingImpl.draw());
		System.out.print("PLANE IS GOING");
		System.out.println(super.drawingImpl.draw());
		
		System.out.println("Plane landed!");
		System.out.println();
	}

}
