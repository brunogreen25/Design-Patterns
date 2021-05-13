package strategy;

//Tests Strategy design pattern with the indirect "pull" type of transferring data.
public class Test {

	public static void main(String[] args) {
		Human h1 = new Human("Jim", "OHara", "12345678");
		h1.startDriving();
		
		h1.setTransport(new Car("Toyota", "red"));
		h1.startDriving();

		h1.setTransport(new Plane("EasyJet"));
		h1.startDriving();
	}

}
