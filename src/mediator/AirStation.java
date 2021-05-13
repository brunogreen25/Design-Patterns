package mediator;

import java.util.ArrayList;
import java.util.List;

public class AirStation implements Mediator {
	
	List<Aircraft> aircrafts;
	
	public void setAricrafts(List<Aircraft> aircrafts) {
		if (this.aircrafts == null) {
			this.aircrafts = new ArrayList<Aircraft>();
		}
		this.aircrafts.addAll(aircrafts);
	}
	
	public void updateAircraft(Aircraft newAircraft) {
		if (this.aircrafts == null) {
			this.aircrafts = new ArrayList<Aircraft>();
		}
		this.aircrafts.add(newAircraft);
	}

	@Override
	public boolean notify(Aircraft component) {
		if (this.aircrafts.contains(component)) {
			return true;
		} else {
			return false;
		}
	}
}
