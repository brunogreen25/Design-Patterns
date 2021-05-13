package bridge;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		testAllOptionsAutomatic();
		//testAllOptions();
	}
	
	public static void testAllOptions() {
		Vehicle car = new Car(new DrawWithDots());
		car.drive();
		car.setDrawingImpl(new DrawWithStars());
		car.drive();
		car.setDrawingImpl(new DrawWithLines());
		car.drive();
		
		Vehicle plane = new Plane(new DrawWithDots());
		plane.drive();
		plane.setDrawingImpl(new DrawWithStars());
		plane.drive();
		plane.setDrawingImpl(new DrawWithLines());
		plane.drive();
	}
	
	public static void testAllOptionsAutomatic() {
		List<Draw> drawings = new ArrayList<Draw>();
		drawings.add(new DrawWithDots());
		drawings.add(new DrawWithLines());
		drawings.add(new DrawWithStars());
		
		for(Draw draw: drawings) {
			Vehicle car = new Car(draw);
			car.drive();
			
			Vehicle plane = new Plane(draw);
			plane.drive();
		}
		
	}

}
