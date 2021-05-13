package bridge;

public abstract class Vehicle {
	protected Draw drawingImpl;
	
	public abstract void drive();
	
	protected Vehicle(Draw drawingImpl) {
		this.drawingImpl = drawingImpl;
	}
	
	public void setDrawingImpl(Draw drawingImpl) {
		this.drawingImpl = drawingImpl;
	}
}
