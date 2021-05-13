package templateMethod;

//Concrete Class
public class Plane extends Drive {
	
	public Plane(String driverName, String drivingType, boolean thrust) {
		super();
		super.driverName = driverName;
		super.drivingType = drivingType;
		super.thrust = thrust;
	}

	@Override
	protected void getInTheVehicle() {
		for(int i = 0; i< 5; i++) {
			System.out.println("FJU FJU FJU.");
		}
		
	}

}
