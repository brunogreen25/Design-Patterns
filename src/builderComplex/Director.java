package builderComplex;

public class Director {
	private Builder houseBuilder;
	
	public Director(Builder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public void changeBuilder(Builder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public void make(Price price) {
		this.houseBuilder.reset();
		this.houseBuilder.buildGarage();
		
		if (price == Price.EXPENSIVE) {
			this.houseBuilder.buildPool();
			this.houseBuilder.buildTrees();
		}
	}
	
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
}
