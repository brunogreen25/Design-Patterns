package templateMethod;

//Abstract Class
public abstract class Drive {
	
	protected String drivingType;
	protected String driverName;
	
	protected boolean thrust;
	
	//Abstract primitive method
	protected abstract void getInTheVehicle();
	
	//The template method
	public void drive() {
		System.out.println(this.driverName + " gets in the vehicle.");
		System.out.println(this.driverName + " starts driving " + this.drivingType);
		if (thrust == true) {
			this.addThrust();
		}
		this.getInTheVehicle();
		System.out.println(this.driverName + " exits the vehicle.");
		
		System.out.println();
		System.out.println();
	}
	
	//Hook method
	private void addThrust() {
		System.out.println("The thrust is added.");
	}
}
