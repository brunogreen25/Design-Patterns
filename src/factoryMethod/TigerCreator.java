package factoryMethod;

public class TigerCreator extends AnimalCreator {

	@Override
	public Animal factoryMethod() {
		Animal tiger = new Tiger();
		return tiger;
	}
	 
}
