package builderComplex;

public class BasicBuilder implements Builder {
	
	private House result;
	
	public BasicBuilder() {
		this.result = new House();
	}

	@Override
	public void reset() {
		this.result = new House();
	}

	@Override
	public void buildGarage() {
		this.result.setGarage("Metal");
	}

	@Override
	public void buildPool() {
		this.result.setPool("Golden");
	}

	@Override
	public void buildTrees() {
		this.result.setTrees("Apple");
	}

	@Override
	public House getHouse() {
		return this.result;
	}
}
