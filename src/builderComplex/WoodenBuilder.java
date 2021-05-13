package builderComplex;

public class WoodenBuilder implements Builder {
	
	private House result;
	
	public WoodenBuilder() {
		this.result = new House();
	}

	@Override
	public void reset() {
		this.result = new House();
	}

	@Override
	public void buildGarage() {
		this.result.setGarage("Wood");		
	}

	@Override
	public void buildPool() {
		this.result.setPool("Wood");		
	}

	@Override
	public void buildTrees() {
		this.result.setTrees("Wood");		
	}

	@Override
	public House getHouse() {
		return this.result;
	}

}
