package adapter;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<String> saleLocationsCar1 = new ArrayList<String>();
		saleLocationsCar1.add("Split");
		saleLocationsCar1.add("New York");
		saleLocationsCar1.add("San Francisco");
		saleLocationsCar1.add("Amsterdam");
		Vehicle car1 = new CarAdapter("Toyota", 5000f, 450f, saleLocationsCar1);
		
		System.out.println(car1.getName());
		System.out.println(car1.getMaxSpeedAchieved());
		System.out.println(car1.getWeight());
		
		System.out.println(car1.getSaleLocationOnLetter("S"));
		car1.deleteSaleLocationsWithStartingLetter("S");
		System.out.println(car1.getSaleLocations());
		
	}
}
