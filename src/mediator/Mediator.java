package mediator;

import java.util.List;

public interface Mediator {
	public boolean notify(Aircraft component);
	public void setAricrafts(List<Aircraft> aircrafts);
	public void updateAircraft(Aircraft newAircraft);
}
