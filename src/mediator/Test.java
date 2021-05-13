package mediator;

public class Test {
	public static void main(String[] args) {
		Mediator airstation = new AirStation();

		Aircraft plane = new Plane(airstation, "Loky");
		Aircraft helicopter1 = new Helicopter(airstation, "Hely");
		Aircraft helicopter2 = new Helicopter(airstation, "Helius");
		Aircraft ufo = new UFO(airstation, "DrWho");
		
		airstation.updateAircraft(plane);
		airstation.updateAircraft(helicopter1);
		airstation.updateAircraft(helicopter2);
		airstation.updateAircraft(ufo);
		
		plane.land();
		helicopter1.land();
		helicopter2.land();
		ufo.land();
	}
}
