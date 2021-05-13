package builderComplex;

public class Test {
	public static void main(String[] args) {
		BasicBuilder basicBuilder = new BasicBuilder();
		WoodenBuilder woodenBuilder = new WoodenBuilder();
		
		Director director = new Director(basicBuilder);
		director.make(Price.EXPENSIVE);
		
		House basicHouse = director.getHouse();
		System.out.println(basicHouse);
		
		director.changeBuilder(woodenBuilder);
		director.make(Price.EXPENSIVE);
		House woodenHouse = director.getHouse();
		System.out.println(woodenHouse);
	}
}
