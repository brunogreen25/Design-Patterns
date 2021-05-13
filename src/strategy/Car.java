package strategy;

//Concrete Strategy
public class Car implements Transport {
	
	private String carType;
	private String color;
	
	public Car(String carType, String color) {
		this.carType = carType;
		this.color = color;
	}

	@Override
	public void drive(Human human) {
		System.out.println(human.getName() + " " + human.getSurname() + " starts driving "+ this.color + " " + this.carType + " car.");
		for (int i=0; i < 10; i++) {
			System.out.println("BRUM BRUM BRUM");
		}
	}
}
