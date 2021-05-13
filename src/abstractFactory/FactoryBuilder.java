package abstractFactory;

public class FactoryBuilder {
	public static AbstractFactory getFactory(AnimalType animalType) {
		if (AnimalType.DOG == animalType) {
			return new DogFactory();
		} else if (AnimalType.CAT == animalType) {
			return new CatFactory();
		}
		return null;
	}
}
