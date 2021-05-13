package abstractFactory;

public class DogFactory extends AbstractFactory {
	
	@Override
	public Animal getAnimal(AnimalType animalType) {
		if (AnimalType.TERIER == animalType) {
			return new Terier();
		} else if (AnimalType.MALTENESE == animalType) {
			return new Maltenese();
		}
		return null;
	}

}
