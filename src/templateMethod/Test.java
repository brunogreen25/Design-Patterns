package templateMethod;

public class Test {

	public static void main(String[] args) {
		Drive vehicle = new Car("Jim", "Toyota", true);
		vehicle.drive();
		
		vehicle = new Plane("Jim", "BOEING", false); 
		vehicle.drive();
	}

}
