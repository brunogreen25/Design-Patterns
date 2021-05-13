package templateMethod;

//Concrete Class
public class Car extends Drive {
	
	public Car(String driverName, String drivingType, boolean thrust) {
		super();
		super.driverName = driverName;
		super.drivingType = drivingType;
		super.thrust = thrust;
	}

	@Override
	protected void getInTheVehicle() {
		for(int i = 0; i< 10; i++) {
			System.out.println("BRUM BRUM BRUM.");
		}
	}

}
