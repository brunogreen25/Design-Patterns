package adapter;

import java.util.List;

public interface Vehicle {
	public String getName();
	public void setName(String name);
	
	public Float getWeight();
	public void setWeight(Float weight);
	
	public Float getMaxSpeedAchieved();
	public void setMaxSpeedAchieved(Float maxAchievedSpeed);
	
	public List<String> getSaleLocations();
	public void setSaleLocations(List<String> saleLocations);
	
	public List<String> getSaleLocationOnLetter(String firstLetter);
	public void deleteSaleLocationsWithStartingLetter(String firstLetter);
	
}
