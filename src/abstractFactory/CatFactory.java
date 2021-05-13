package abstractFactory;

public class CatFactory extends AbstractFactory {

	@Override
	public Animal getAnimal(AnimalType animalType) {
		if (animalType == AnimalType.DOMESTIC_CAT) {
			return new DomesticCat();
		} else if (animalType == AnimalType.WILD_CAT) {
			return new WildCat();
		}
		return null;
	}
	
}
