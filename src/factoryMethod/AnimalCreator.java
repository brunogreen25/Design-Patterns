package factoryMethod;

public abstract class AnimalCreator {
	public abstract Animal factoryMethod();
	
	private Animal operation() {
		Animal animal = factoryMethod();
		return animal;
	}
}
