package adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarAdapter implements Vehicle {
	
	private Car car;
	
	public CarAdapter(String name, Float weight, Float maxSpeed, List<String> saleLocations) {
		car = new Car(name, String.valueOf(weight / 1000), String.valueOf(maxSpeed * 1000), saleLocations);
	}

	@Override
	public String getName() {
		return car.getName();
	}

	@Override
	public void setName(String name) {
		car.setName(name);
	}

	@Override
	public Float getWeight() {
		return Float.parseFloat(car.getWeightInTons()) * 1000;
	}

	@Override
	public void setWeight(Float weight) {
		weight /= 1000;
		car.setWeightInTons(String.valueOf(weight));
	}

	@Override
	public Float getMaxSpeedAchieved() {
		return Float.parseFloat(car.getMaxSpeedAchievedInMSec()) / 1000;
	}

	@Override
	public void setMaxSpeedAchieved(Float maxAchievedSpeed) {
		maxAchievedSpeed *= 1000;
		car.setMaxSpeedAchievedInMSec(String.valueOf(maxAchievedSpeed));
	}

	@Override
	public List<String> getSaleLocations() {
		return car.getSaleLocations();
	}

	@Override
	public void setSaleLocations(List<String> saleLocations) {
		List<String> saleLocs = new ArrayList<String>();
		saleLocs.addAll(saleLocations);
		car.setSaleLocations(saleLocs);
	}

	@Override
	public List<String> getSaleLocationOnLetter(String firstLetter) {
		List<String> saleLocs = car.getSaleLocations();
		saleLocs = saleLocs.stream().filter(loc -> loc.charAt(0) == firstLetter.charAt(0)).collect(Collectors.toList());
		return saleLocs;
	}
	
	@Override
	public void deleteSaleLocationsWithStartingLetter(String firstLetter) {
		List<String> saleLocs = car.getSaleLocations();
		saleLocs = saleLocs.stream().filter(loc -> loc.charAt(0) != firstLetter.charAt(0)).collect(Collectors.toList());
		this.setSaleLocations(saleLocs);
	}
}
