package adapter;

import java.util.*;

public class Car {
	private String name;
	private String weightInTons;
	private String maxSpeedAchievedInMSec;
	private List<String> saleLocations;
	
	public Car(String name, String weightInTons, String maxSpeedAchievedInMSec, List<String> saleLocations) {
		this.name = name;
		this.weightInTons = weightInTons;
		this.maxSpeedAchievedInMSec = maxSpeedAchievedInMSec;
		
		this.saleLocations = new ArrayList<String>();
		this.saleLocations.addAll(saleLocations);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeightInTons() {
		return weightInTons;
	}

	public void setWeightInTons(String f) {
		this.weightInTons = f;
	}

	public String getMaxSpeedAchievedInMSec() {
		return maxSpeedAchievedInMSec;
	}

	public void setMaxSpeedAchievedInMSec(String maxSpeedAchievedInMSec) {
		this.maxSpeedAchievedInMSec = maxSpeedAchievedInMSec;
	}

	public List<String> getSaleLocations() {
		return saleLocations;
	}

	public void setSaleLocations(List<String> saleLocations) {
		this.saleLocations = saleLocations;
	}	
}
