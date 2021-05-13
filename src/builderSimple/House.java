package builderSimple;

public class House {
	private String walls;
	private String pool;
	private String garage;
	private int windowNumber;
	private int doorNumber;
	private int treeNumber;
	
	public House(String walls, String pool, String garage, int windowNumber, int doorNumber, int treeNumber) {
		this.walls = walls;
		this.pool = pool;
		this.garage = garage;
		this.windowNumber = windowNumber;
		this.doorNumber = doorNumber;
		this.treeNumber = treeNumber;
	}
	
	
	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public String getPool() {
		return pool;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public int getWindowNumber() {
		return windowNumber;
	}
	public void setWindowNumber(int windowNumber) {
		this.windowNumber = windowNumber;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public int getTreeNumber() {
		return treeNumber;
	}
	public void setTreeNumber(int treeNumber) {
		this.treeNumber = treeNumber;
	}


	@Override
	public String toString() {
		return "House [walls=" + walls + ", pool=" + pool + ", garage=" + garage + ", windowNumber=" + windowNumber
				+ ", doorNumber=" + doorNumber + ", treeNumber=" + treeNumber + "]";
	}
}
