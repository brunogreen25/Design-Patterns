package visitor;

public class Test {
	public static void main(String[] args) {
		Car car1 = new Toyota("Dear-y");
		System.out.println(car1.getName());
		System.out.println(car1.acceptDrive(new Broken()));
		System.out.println(car1.acceptStop(new Broken()));
		System.out.println();
		
		Car car2 = new Fiat("Monster");
		System.out.println(car2.getName());
		System.out.println(car2.acceptDrive(new Fixed()));
		System.out.println(car2.acceptStop(new Fixed()));
		System.out.println();
	}
}
