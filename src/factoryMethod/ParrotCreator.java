package factoryMethod;

public class ParrotCreator extends AnimalCreator {

	@Override
	public Animal factoryMethod() {
		Animal parrot = new Parrot();
		return parrot;
	}
}
