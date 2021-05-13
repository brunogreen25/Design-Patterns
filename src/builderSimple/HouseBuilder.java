package builderSimple;

public class HouseBuilder {
	private String walls;
	private String pool;
	private String garage;
	private int windowNumber;
	private int doorNumber;
	private int treeNumber;
	
	public HouseBuilder setWalls(String walls) {
		this.walls = walls;
		return this;
	}
	public HouseBuilder setPool(String pool) {
		this.pool = pool;
		return this;
	}
	public HouseBuilder setGarage(String garage) {
		this.garage = garage;
		return this;
	}
	public HouseBuilder setWindowNumber(int windowNumber) {
		this.windowNumber = windowNumber;
		return this;
	}
	public HouseBuilder setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
		return this;
	}
	public HouseBuilder setTreeNumber(int treeNumber) {
		this.treeNumber = treeNumber;
		return this;
	}
	
	public House getHouse() {
		return new House(walls, pool, garage, windowNumber, doorNumber, treeNumber);
	}
}
