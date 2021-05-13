package strategy;

//Concrete Strategy
public class Plane implements Transport {
	
	private String planeCompany;
	
	public Plane(String planeType) {
		this.planeCompany = planeCompany;
	}
	
	@Override
	public void drive(Human human) {
		System.out.println(human.getName() + " " + human.getSurname() + " gets in the airplane of " + this.planeCompany + ".");
		System.out.println("The officers check the id:" + human.getId());
		System.out.println("Everything seems fine.");
		System.out.println("The airplane starts.");
		for(int i=0; i<5; i++) {
			System.out.println("FJUU FJUU FJUU");
		}
	}	
}
