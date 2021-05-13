package builderComplex;

public class House {
	private String garage;
	private String pool;
	private String trees;
	
	public String getGarage() {
		return garage;
	}
	public void setGarage(String garage) {
		this.garage = garage;
	}
	public String getPool() {
		return pool;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	public String getTrees() {
		return trees;
	}
	public void setTrees(String trees) {
		this.trees = trees;
	}
	
	@Override
	public String toString() {
		return "House [garage=" + garage + ", pool=" + pool + ", trees=" + trees + "]";
	}
}
