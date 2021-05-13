package facade;

public class SelfDrivingCar {

	private GetInCar enter;
	private StartEngine start;
	private Go go;
	private StopEngine stop;
	private ExitCar exit;
	
	public SelfDrivingCar() {
		this.enter = new GetInCar();
		this.start = new StartEngine();
		this.go = new Go();
		this.stop = new StopEngine();
		this.exit = new ExitCar();
	}
	
	public void drive() {
		System.out.println(enter.getInCar());
		System.out.println(start.startEngine());
		System.out.println(go.go());
		System.out.println(stop.stopEngine());
		System.out.println(exit.exitCar());
	}
}
